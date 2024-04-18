package arraySolutions;

import java.util.Scanner;

public class Solution029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array A of N real numbers, find the minimum among elements with even order numbers: A2, A4, A6, … .
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] A = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextDouble();
        }
        scanner.close();

        double maxOdd = findMaxOdd(A);

        System.out.println("Maximum among elements with odd order numbers: " + maxOdd);

    }
    public static double findMaxOdd(double[] array) {
        double maxOdd = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > maxOdd) {
                maxOdd = array[i];
            }
        }

        return maxOdd;
    }

}
