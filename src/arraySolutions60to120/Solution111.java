package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, triple occurrences of all elements whose values are odd numbers.
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


        doubleValues(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static void doubleValues(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 1)
                array[i] = array[i] * 2;
    }
}
