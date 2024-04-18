package arraySolutions;

import java.util.Scanner;

public class Solution028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array A of N real numbers, find the minimum among elements with even order numbers: A2, A4, A6, … .
                """);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        double[] A = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextDouble();
        }
        scanner.close();

        double minEven = findMinEven(A);

        System.out.println("Minimum among elements with even order numbers: " + minEven);
    }
    public static double findMinEven(double[] array) {
        double minEven = Double.MAX_VALUE;

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] < minEven) {
                minEven = array[i];
            }
        }

        return minEven;
    }

}
