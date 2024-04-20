package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers and two integers K and L (1 ≤ K < L ≤ N) are given.
                Remove elements with the order numbers in the range K to L inclusively from
                the array and output the size of the changed array and all its elements.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();
        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();
        System.out.print("Enter integer L: ");
        int l = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = removeElementsInRange(arrayA, k, l);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static double[] removeElementsInRange(double[] array, int k, int l) {
        int N = array.length;

        int numToRemove = l - k + 1;

        double[] newArray = new double[N - numToRemove];

        // Copy elements from the original array to the new array,
        // excluding elements in the range K to L
        int newIndex = 0;
        for (int i = 0; i < N; i++) {
            if (i < k - 1 || i >= l) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }

}
