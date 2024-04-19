package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real number R and an array A of N real numbers are given. Find the array element
                that is the nearest to the number R (i. e., an element A(K) such that the value |A(K) − R| is minimal).
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

        double nearest = findNearestNumber(array, r);
        System.out.printf("In that array nearest to R = %s  is %s", r, nearest);

    }

    public static double findNearestNumber(double[] array, int k) {
        if (array == null || array.length == 0) return Double.NaN;
        double min = Double.MAX_VALUE;
        double result = array[0];
        for (double v : array) {
            if (v - k <= min) {
                min = v - k;
                result = v;
            }
        }
        return result;
    }

}
