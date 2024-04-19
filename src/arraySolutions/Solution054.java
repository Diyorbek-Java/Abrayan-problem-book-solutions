package arraySolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N integers is given. Write elements of A whose values are even numbers
                to a new array B (in the same order) and output the size of array B and all its elements.
                """);
        System.out.println("Enter size of arrays: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];

        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        ArrayList<Double> arrayB = creatArrayWithEvenValues(arrayA);

        System.out.println("The given A array ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("The created Array B with even values: ");
        System.out.println(arrayB);
        System.out.println("The size of it is " + arrayB.size());

    }

    public static ArrayList<Double> creatArrayWithEvenValues(double[] array) {
        ArrayList<Double> result = new ArrayList<>();
        int count = 0;
        for (double v : array) {
            if (v % 2 == 0) {
                result.add(v);
            }
        }
        return result;
    }
}
