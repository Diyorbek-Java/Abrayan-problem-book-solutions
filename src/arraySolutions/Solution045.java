package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, find two nearest array elements
                (i. e., two different elements A(K) and A(L) such that the value |A(K) − A(L)| is minimal) and
                output their order numbers in ascending order.
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

        double[] nearestElements = findOrderOfNearestArrayElements(array);
        System.out.printf("The nearest elements in the array are: %s", Arrays.toString(nearestElements));

    }

    public static double[] findOrderOfNearestArrayElements(double[] array) {
        double[] result = new double[2];
        double minimal = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) < minimal) {
                    minimal = Math.abs(array[i] - array[j]);
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        return result;
    }
}
