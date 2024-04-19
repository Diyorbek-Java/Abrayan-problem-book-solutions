package arraySolutions;

import java.util.Scanner;

public class Solution034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the maximum among
                its local minimums (see the local minimum definition in Array32).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        double maxLocalMinimum = findMaxLocalMinimum(array);

        if (Double.isNaN(maxLocalMinimum)) {
            System.out.println("No local minimum found.");
        } else {
            System.out.println("The maximum among the local minimums is: " + maxLocalMinimum);
        }
    }

    public static double findMaxLocalMinimum(double[] array) {
        double maxLocalMin = Double.NEGATIVE_INFINITY;

        for (int i = 1; i < array.length - 1; i++) {
            if (isLocalMinimum(array, i)) {
                maxLocalMin = Math.max(maxLocalMin, array[i]);
            }
        }

        return maxLocalMin;
    }

    public static boolean isLocalMinimum(double[] array, int index) {
        return array[index] < array[index - 1] && array[index] < array[index + 1];
    }
}
