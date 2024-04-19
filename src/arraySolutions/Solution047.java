package arraySolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, find the amount of its elements with distinct values.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int distinctCount = countDistinctElements(array);

        System.out.println("The number of distinct elements in the array is: " + distinctCount);

    }

    public static int countDistinctElements(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            uniqueElements.add(array[i]);
        }

        return uniqueElements.size();
    }

}
