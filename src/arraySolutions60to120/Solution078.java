package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given an array of N real numbers, replace each array element with the average of this element and its neighbors.
                """);

        System.out.print("Enter the array  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        double[] resultArray = changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(resultArray));


    }

    public static double[] changeElements(double[] array) {
        double[] result = new double[array.length];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sum += array[i - 1];
            }

            if (i < array.length - 1) {
                sum += array[i + 1];
            }
            result[i] = sum / (i == 0 || i == array.length - 1 ? 2 : 3);
        }
        return result;

    }


}
