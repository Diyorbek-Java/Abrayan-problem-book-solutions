package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and an integer K (1 ≤ K ≤ N) are given.
                Insert a new element with zero value before an element with the order number K.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        System.out.print("Enter number K: ");
        int k = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = insertElement(arrayA, k);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static double[] insertElement(double[] array, int k) {
        double[] newArray = new double[array.length + 1];

        for (int i = 0; i < k - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[k - 1] = 0.0;

        for (int i = k; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}
