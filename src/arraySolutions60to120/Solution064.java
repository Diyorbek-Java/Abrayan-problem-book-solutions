package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Three arrays A, B, C of N(A), NB, NC integers are given. Values of elements of each array are in descending order. Write all elements of A, B, C to a new array D (of size NA + NB + NC) so that values of all elements of D were in descending order.
                """);
        System.out.print("Enter the size of the arrays: ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();
        int[] arrayB = new int[n];
        System.out.println("Enter elements of Array B: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        int[] arrayC = new int[n];
        System.out.println("Enter elements of Array C: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();
        scanner.close();

        int[] arrayD = mergeSortedArraysDescending(arrayA, arrayB, arrayC);
        System.out.println("Merged array D:");
        System.out.println(Arrays.toString(arrayD));


    }

    public static int[] mergeSortedArraysDescending(int[] arrayA, int[] arrayB, int[] arrayC) {
        int[] result = new int[arrayA.length + arrayB.length + arrayC.length];
        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length && k < arrayC.length) {
            if (arrayA[i] >= arrayB[j] && arrayA[i] >= arrayC[k]) {
                result[k + j + i] = arrayA[i++];
            } else if (arrayB[j] >= arrayA[i] && arrayB[j] >= arrayC[k]) {
                result[k + j + i] = arrayB[j++];
            } else {
                result[k + j + i] = arrayC[k++];
            }
        }

        while (i < arrayA.length) {
            result[k + j + i] = arrayA[i++];
        }

        while (j < arrayB.length) {
            result[k + j + i] = arrayB[j++];
        }

        while (k < arrayC.length) {
            result[k + j + i] = arrayC[k++];
        }

        return result;
    }
}
