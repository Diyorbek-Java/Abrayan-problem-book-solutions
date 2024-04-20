package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers, assign zero value to all its local maximums
                (an array element is called the local maximum if it is greater than its neighbors).
                """);

        System.out.print("Enter the array size N: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();
        System.out.print("Enter the integer K: ");
        int k = scanner.nextInt();
        System.out.print("Enter integer L: ");
        int l = scanner.nextInt();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array) {
        for (int i = 1; i < array.length - 1; i++)
            if (array[i] > array[i - 1] && array[i] < array[i + 1])
                array[i] = 0;

    }


}
