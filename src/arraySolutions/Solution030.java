package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. Find the order numbers of array elements that are greater than their right neighbor.
                Output these order numbers in ascending order and also output the amount of such elements.
                """);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        double[] array = new double[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        double[] result = findElementsGraterThanRightNeighbour(array);
        Arrays.sort(result);
        System.out.println("Array in given order: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Array after solution applied: ");
        System.out.println(Arrays.toString(result));


    }

    public static double[] findElementsGraterThanRightNeighbour(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result[i] = array[i];
            }
        }
        return result;
    }

}
