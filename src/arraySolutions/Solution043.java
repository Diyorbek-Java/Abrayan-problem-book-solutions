package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers whose values are in ascending or in descending order,
                find the amount of its elements with distinct values.
                """);
        System.out.print("Enter the number R :");
        int r = scanner.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(array));

        int distinctCount = countDistinctElements(array);

        System.out.println("The number of distinct elements in the array is: " + distinctCount);

    }

    public static int countDistinctElements(int[] array) {
        int distinctCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                distinctCount++;
            }
        }

        return distinctCount;
    }

}
