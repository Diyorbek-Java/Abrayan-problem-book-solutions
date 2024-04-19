package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find the amount of its
                parts of descending (that is, parts that contain elements whose values are in descending order).
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        int ascendingOrderedValues = descendingOrder(array);

        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of elements that are in ascending order: " + ascendingOrderedValues);

    }

    public static int descendingOrder(double[] array) {
        if (array.length <= 1) return array.length;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                // If the current element is greater than or equal to the previous one,
                // it's still part of the ascending segment
                continue;
            }
            count++;
        }
        return count;
    }

}
