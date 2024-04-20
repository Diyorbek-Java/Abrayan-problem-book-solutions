package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N (≤ 6) real numbers is given. Sort the array in ascending order by using the insertion
                sort method: compare an element A(2) with the first element A(1) and exchange their values, if necessary,
                so that these elements were in ascending order; then move an element A3 to the left (sorted) part of
                the array, so that three elements were in ascending order; repeat this process for other array elements.
                Output all array elements after processing of each element (from A2 to AN). Note that it is convenient
                to assign the array element being processed to an additional array element A0 (the barrier element).
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


        insertionSort(arrayA);
    }

    public static void insertionSort(double[] array) {
        int n = array.length;

        for (int i = 2; i < n; i++) {
            double key = array[i];
            int j = i - 1;

            while (j > 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            System.out.println("Array after processing element A" + i + ":");
            for (int k = 1; k < n; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}
