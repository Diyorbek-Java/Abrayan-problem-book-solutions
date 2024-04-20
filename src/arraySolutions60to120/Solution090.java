package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and an integer K (1 ≤ K ≤ N) are given.
                Remove an element with the order number K from the array.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();
        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = removeElement(arrayA, k);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static double[] removeElement(double[] array, int k) {
        int N = array.length;

        double[] newArray = new double[N - 1];

        // Copy elements from the original array to the new array,
        // excluding the element at index K - 1
        int newIndex = 0;
        for (int i = 0; i < N; i++) {
            if (i != k - 1) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }

}
