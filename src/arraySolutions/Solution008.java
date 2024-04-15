package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, output all odd numbers contained in the array in ascending order of their indices.
                Also output the amount K of odd numbers contained in the array.
                """);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Odd numbers in the array and their indices:");
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Index " + i + ": " + numbers[i]);
                countOdd++;
            }
        }

        System.out.println("Total odd numbers: " + countOdd);
    }

}
