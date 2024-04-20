package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N (≤ 6) real numbers is given. Sort the array in ascending order by using the selection sort method:
                find the greatest element in the array and exchange the values of the greatest element and the last element
                (with the order number N); repeat N − 1 times this process, reducing the amount of analyzed elements by 1 after
                each array pass. Output all array elements after each pass for checking results.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));


        selectionSort(arrayA);
    }

    public static void selectionSort(double[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = 0;
            for (int j = 1; j < n - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            double temp = array[n - i - 1];
            array[n - i - 1] = array[maxIndex];
            array[maxIndex] = temp;

            System.out.println("Array after pass " + (i + 1) + ":");
            for (double num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
