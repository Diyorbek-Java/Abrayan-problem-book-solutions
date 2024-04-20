package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and two integers K and M (1 ≤ K ≤ N, 1 ≤ M ≤ 10) are given.
                Insert M new elements with zero value after an element with the order number K.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        System.out.print("Enter the integer M:  ");
        int m = scanner.nextInt();
        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = insertElementsAfterK(arrayA, k, m);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static double[] insertElementsAfterK(double[] array, int k, int m) {
        double[] newArray = new double[array.length + m];

        for (int i = 0; i < k; i++) {
            newArray[i] = array[i];
        }

        for (int i = k, j = 0; j < m; i++, j++) {
            newArray[i] = 0.0;
        }

        for (int i = k + m, j = k; j < array.length; i++, j++) {
            newArray[i] = array[j];
        }

        return newArray;
    }
}
