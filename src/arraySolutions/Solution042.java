package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 A real number R and an array of N real numbers are given.
                 Find two adjacent elements whose sum of values is the nearest to the number R and
                 output these elements in ascending order of its indices (see the definition of two nearest numbers in Array40).
                """);
        System.out.print("Enter the number R :");
        int r = scanner.nextInt();
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

        double[] nearest = findNearestCoupleNumber(array, r);
        System.out.printf("In that array nearest to R = %s  is %s", r, nearest);

    }

    public static double[] findNearestCoupleNumber(double[] array, int k) {
        if (array == null || array.length == 0) return array;
        double min = Double.MAX_VALUE;

        double[] result = new double[2];
        for (int i = 0; i < array.length - 1; i++) {
            double temp = Math.abs((array[i] + array[i + 1]) - k);
            if (temp <= min) {
                min = array[i] + array[i + 1];
                result[0] = array[i];
                result[1] = array[i + 1];
            }
        }
        return result;
    }

}
