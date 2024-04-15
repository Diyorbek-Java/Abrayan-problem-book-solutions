package arraySolutions;

import java.util.Scanner;

public class Solution009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, output all even numbers contained in the array in descending order of their indices.
                Also output the amount K of even numbers contained in the array.
                """);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();


        System.out.println("Even numbers in the array and their indices:");
        int countEven = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Index " + i + ": " + numbers[i]);
                countEven++;
            }
        }

        System.out.println("Total even numbers: " + countEven);
    }

}
