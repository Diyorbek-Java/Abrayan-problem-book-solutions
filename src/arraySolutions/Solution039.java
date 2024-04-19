package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the amount of its parts of monotonicity
                (that is, parts that contain elements whose values are in ascending or in descending order).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(array));

        int monotonicParts = countMonotonicParts(array);

        System.out.println("The amount of monotonic parts in the array is: " + monotonicParts);

    }
    public static int countMonotonicParts(double[] array) {
        if (array.length <= 1) return array.length;

        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                // Increasing sequence
                while (i < array.length && array[i] > array[i - 1]) {
                    i++;
                }
                count++;
            } else if (array[i] < array[i - 1]) {
                // Decreasing sequence
                while (i < array.length && array[i] < array[i - 1]) {
                    i++;
                }
                count++;
            }
        }
        return count;
    }

}
