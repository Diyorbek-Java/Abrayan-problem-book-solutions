package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N (≤ 6) real numbers is given. Sort the array in ascending order by using the exchange sort method
                (the bubble sorting): compare each pair of two adjacent elements (A(1) and A(2), A(2) and A(3), and so on) and exchange
                their values in case the left element is greater than the right one; repeat N − 1 times such array pass.
                Output all array elements after each pass for checking results. Note that the amount of analyzed pairs of
                the array elements can be reduced by 1 after each pass.
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


        bubbleSort(arrayA);
    }

    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Array after pass " + (i + 1) + ":");
            for (double num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            if (!swapped) {
                break;
            }
        }
    }
}
