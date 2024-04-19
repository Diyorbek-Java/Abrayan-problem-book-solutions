package arraySolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N (≤ 15) integers is given. Write elements of A with odd order
                numbers (1, 3, …) to a new array B and output the size of array B and all its elements.
                Do not use conditional statements.
                """);
        System.out.println("Enter size of arrays: ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];

        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();
        System.out.println("The given A array ");
        System.out.println(Arrays.toString(arrayA));

        int[] arrayB = getSortedArray(arrayA);
        System.out.println("The created Array B: ");
        System.out.println(Arrays.toString(arrayB));

    }

    public static int[] getSortedArray(int[] array) {
        int[] sortedArray = new int[array.length / 2];
        int index = 0;
        for (int i = 1; i < array.length; i += 2)
            sortedArray[index++] = array[i];

        return sortedArray;
    }
}
