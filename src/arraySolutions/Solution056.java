package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N (≤ 15) integers is given. Write elements of
                A with order numbers that are multiples of 3 (3, 6, …) to a
                new array B and output the size of array B and all its elements.
                Do not use conditional statements.
                """);
        System.out.println("Enter size of arrays(≤ 15): ");
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
        int length = array.length / 3;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[(i + 1) * 3 - 1];
        }
        return result;
    }
}
