package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N real numbers (N is an even number),
                exchange values of the first half and the second half of its elements.
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
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            double temp = array[i];
            array[i] = array[i + halfLength];
            array[i + halfLength] = temp;
        }
    }


}
