package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, insert an element with zero value after each element with negative value.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));


        arrayA = insertZeroAfterNegative(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static double[] insertZeroAfterNegative(double[] array) {
        int negativeCount = 0;
        for (double num : array) {
            if (num < 0) {
                negativeCount++;
            }
        }

        double[] newArray = new double[array.length + negativeCount];

        int newIndex = 0;

        for (double num : array) {
            newArray[newIndex++] = num;
            if (num < 0) {
                newArray[newIndex++] = 0.0;
            }
        }

        return newArray;
    }
}
