package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real number R and an array of N real numbers are given. Find two different elements
                such that the sum of their values is the nearest to the number R,and output these
                elements in ascending order of indices (see the definition of two nearest numbers in Array40).
                """);
        System.out.print("Enter number R:");
        double r = scanner.nextDouble();
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

        double[] closestNumbers = nearestElementsToR(array, r);

        System.out.printf("The nearest elements for R = %s are %s", r, Arrays.toString(closestNumbers));

    }

    public static double[] nearestElementsToR(double[] array, double r) {
        if (array == null || array.length == 0) return null;
        double[] result = new double[2];
        double min = Double.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs((array[i] + array[i - 1]) - r) < min) {
                min = Math.abs((array[i] + array[i - 1]) - r);
                result[0] = array[i];
                result[1] = array[i - 1];
            }
        }
        Arrays.sort(result);
        return result;
    }
}
