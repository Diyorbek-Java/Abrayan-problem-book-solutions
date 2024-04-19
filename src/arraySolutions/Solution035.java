package arraySolutions;

import java.util.Scanner;

public class Solution035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the minimum among
                its local maximums (see the local maximum definition in Array33).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        double minLocalMaximum = findMinLocalMaximum(array);

        if (Double.isNaN(minLocalMaximum)) {
            System.out.println("No local maximum found.");
        } else {
            System.out.println("The minimum among the local maximums is: " + minLocalMaximum);
        }
    }

    public static double findMinLocalMaximum(double[] array) {
        double minLocalMax = Double.POSITIVE_INFINITY;

        for (int i = 1; i < array.length - 1; i++) {
            if (isLocalMaximum(array, i)) {
                minLocalMax = Math.min(minLocalMax, array[i]);
            }
        }

        return minLocalMax;
    }

    public static boolean isLocalMaximum(double[] array, int index) {
        return array[index] > array[index - 1] && array[index] > array[index + 1];
    }
}
