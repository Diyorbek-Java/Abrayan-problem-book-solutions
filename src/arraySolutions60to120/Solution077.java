package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, replace each local minimum with its square
                (an array element is called the local minimum if it is smaller than its neighbors).
                """);

        System.out.print("Enter the array size N: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array) {
        for (int i = 1; i < array.length - 1; i++)
            if (array[i] < array[i - 1] && array[i] > array[i + 1])
                array[i] = Math.pow(array[i], 2);

    }


}
