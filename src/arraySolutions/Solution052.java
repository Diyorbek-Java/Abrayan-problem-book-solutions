package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array A of N real numbers, create a new array B of the same size with elements defined as:
                        B(K)= 2·A(K),if A(K) < 5,
                        A(K)/2	otherwise.
                """);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        scanner.close();
        double[] arrayB = createTheSameSizeArray(arrayA);
        System.out.println("The given Array A: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("The created Array B: ");
        System.out.println(Arrays.toString(arrayB));
    }

    public static double[] createTheSameSizeArray(double[] arrayA) {
        double[] arrayB = new double[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < 5)
                arrayB[i] = arrayA[i] * 2;
            else
                arrayB[i] = arrayA[i] / 2;
        }
        return arrayB;
    }

}
