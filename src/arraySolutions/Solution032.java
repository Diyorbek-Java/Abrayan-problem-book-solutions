package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the order number of its first local minimum
                (an array element is called the local minimum if it is smaller than its neighbors).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        int localMinimumIndex = findLocalMinimum(array);

        if (localMinimumIndex == -1) {
            System.out.println("No local minimum found.");
        } else {
            System.out.println("The order number of the first local minimum is: " + (localMinimumIndex + 1));
        }
    }

    public static int findLocalMinimum(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isLocalMinimum(array, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isLocalMinimum(double[] array, int index) {
        if (index == 0) {
            return array[index] < array[index + 1];
        } else if (index == array.length - 1) {
            return array[index] < array[index - 1];
        } else {
            return array[index] < array[index - 1] && array[index] < array[index + 1];
        }
    }
}
