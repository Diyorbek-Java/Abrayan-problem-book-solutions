package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N (> 2) integers, remove all elements with odd order numbers (1, 3, …)
                from the array. Do not use conditional statements.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = removeOddOrderNumbers(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static int[] removeOddOrderNumbers(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
            counter++;
        }
        int[] result = new int[counter];
        counter = 0;
        for (int value : array)
            if (value != 0) {
                result[counter] = value;
                counter++;
            }

        return result;
    }


}
