package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two arrays A and B of 5 real numbers are given. Values of elements of each array are in ascending order.
                Write all elements of A and B to a new array C (of size 10) so that values of all elements of
                C were in ascending order.
                """);

        double[] arrayA = new double[5];
        System.out.println("Enter elements of Array A (size = 5): ");
        for (int i = 0; i < 5; i++)
            arrayA[i] = scanner.nextInt();

        double[] arrayB = new double[5];
        System.out.println("Enter elements of Array B (size = 5): ");
        for (int i = 0; i < 5; i++)
            arrayB[i] = scanner.nextInt();

        scanner.close();

        double[] arrayC = mergeSortedArrays(arrayA, arrayB);
        System.out.println("Merged array C:");
        for (double num : arrayC) {
            System.out.println(num);
        }

    }

    public static double[] mergeSortedArrays(double[] arrayA, double[] arrayB) {
        double[] arrayC = new double[arrayA.length + arrayB.length];
        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                arrayC[k++] = arrayA[i++];
            } else {
                arrayC[k++] = arrayB[j++];
            }
        }

        while (i < arrayA.length) {
            arrayC[k++] = arrayA[i++];
        }

        while (j < arrayB.length) {
            arrayC[k++] = arrayB[j++];
        }

        return arrayC;
    }
}
