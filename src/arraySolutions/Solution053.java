package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two arrays A and B of N real numbers are given. Create a new array C of the same size;
                each element C(K) must be equal to the largest of elements of A and B with the same index K.
                """);
        System.out.println("Enter size of arrays: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        double[] arrayB = new double[n];
        System.out.println("Enter elements of Array B: ");

        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        double[] arrayC = createTheSameSizeArray(arrayA, arrayB);
        System.out.println("The given Array A:");
        System.out.println(Arrays.toString(arrayA));

        System.out.println("The given Array B:");
        System.out.println(Arrays.toString(arrayB));

        System.out.println("The created Array C:");
        System.out.println(Arrays.toString(arrayC));

    }

    public static double[] createTheSameSizeArray(double[] arrayA, double[] arrayB) {
        double[] arrayC = new double[arrayA.length];
        for (int i = 0; i < arrayA.length; i++)
            arrayC[i] = Math.max(arrayA[i], arrayB[i]);
        return arrayC;
    }

}
