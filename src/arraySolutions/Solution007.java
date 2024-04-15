package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given an array of N real numbers, output its elements in inverse order.
                """);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        System.out.println("Enter the elements in inverse order: ");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Array in reverse order:");
        printInReverse(numbers);
        scanner.close();
    }

    public static void printInReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
