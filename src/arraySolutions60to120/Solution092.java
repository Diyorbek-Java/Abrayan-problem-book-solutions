package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, remove all odd numbers from
                the array and output the size of the changed array and all its elements.
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

        arrayA = removeOddValues(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static int[] removeOddValues(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int j : array)
            if (j != 0) {
                result[counter] = j;
                counter++;
            }

        return result;
    }


}
