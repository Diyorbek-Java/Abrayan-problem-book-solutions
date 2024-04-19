package arraySolutions;

import java.util.Scanner;

public class Solution033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the order number of its last local maximum
                (an array element is called the local maximum if it is greater than its neighbors).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        int localMaximumIndex = findLastLocalMaximum(array);

        if (localMaximumIndex == -1) {
            System.out.println("No local maximum found.");
        } else {
            System.out.println("The order number of the last local maximum is: " + (localMaximumIndex + 1));
        }
    }

    public static int findLastLocalMaximum(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (isLocalMaximum(array, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isLocalMaximum(double[] array, int index) {
        if (index == 0) {
            return array[index] > array[index + 1];
        } else if (index == array.length - 1) {
            return array[index] > array[index - 1];
        } else {
            return array[index] > array[index - 1] && array[index] > array[index + 1];
        }
    }
}
