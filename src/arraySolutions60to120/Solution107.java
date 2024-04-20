package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, triple occurrences of elements with odd order numbers (1, 3, …).
                Do not use conditional statements in loops.
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

        doubleElements(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static void doubleElements(double[] array) {
        for (int i = 1; i < array.length; i += 2)
            array[i] = array[i] * 2;
    }
}
