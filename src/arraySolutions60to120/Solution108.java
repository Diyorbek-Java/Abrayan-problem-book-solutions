package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, insert an element with zero value before each element with positive value.
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


        arrayA = insertZeroBeforePositive(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static double[] insertZeroBeforePositive(double[] array) {
        int positiveCount = 0;
        for (double num : array) {
            if (num > 0) {
                positiveCount++;
            }
        }

        double[] newArray = new double[array.length + positiveCount];

        int newIndex = 0;

        for (double num : array) {
            if (num > 0) {
                newArray[newIndex++] = 0.0;
            }
            newArray[newIndex++] = num;
        }

        return newArray;
    }
}
