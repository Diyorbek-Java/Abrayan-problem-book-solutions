package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N integers is given. A group of successive array elements with equal values is called a
                series of equal numbers, the amount of its elements is called a length of series (a length of series
                may be equal to 1), the value of its elements is called a value of series. Create and output two new
                integer-valued arrays B and C containing respectively lengths and values of all series of equal numbers
                of the array A.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();
        int[] B = seriesLengths(arrayA);
        int[] C = seriesValues(arrayA);

        System.out.println("Lengths of series:");
        printArray(B);
        System.out.println("Values of series:");
        printArray(C);

    }

    public static int[] seriesLengths(int[] A) {
        ArrayList<Integer> lengths = new ArrayList<>();
        int currentLength = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                currentLength++;
            } else {
                lengths.add(currentLength);
                currentLength = 1;
            }
        }
        lengths.add(currentLength);

        int[] result = new int[lengths.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = lengths.get(i);
        }
        return result;
    }

    public static int[] seriesValues(int[] A) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                values.add(A[i]);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[values.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = values.get(i);
        }
        return result;
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
