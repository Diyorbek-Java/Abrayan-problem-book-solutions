package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array A of N real numbers, create two new arrays B and C and write all positive
                elements of A to the array B and all negative elements of A to the array C (in the same order).
                Output the size of the array B and all its elements and then output the size of the array C and all its elements.
                """);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];

        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();
        System.out.println("The given A array ");
        System.out.println(Arrays.toString(arrayA));

        ArrayList<Double> arrayB = getPositiveElementsOfArray(arrayA);
        System.out.println("The created Array B : Size is " + arrayB.size());
        System.out.println(arrayB.toString());

        ArrayList<Double> arrayC = getNegativeElementsOfArray(arrayA);
        System.out.println("The created Array C : Size is " + arrayC.size());
        System.out.println(arrayC.toString());
    }

    public static ArrayList<Double> getPositiveElementsOfArray(double[] array) {
        ArrayList<Double> result = new ArrayList<>();
        for (double v : array) {
            if (v > 0) {
                result.add(v);
            }
        }
        return result;
    }

    public static ArrayList<Double> getNegativeElementsOfArray(double[] array) {
        ArrayList<Double> result = new ArrayList<>();
        for (double v : array) {
            if (v < 0) {
                result.add(v);
            }
        }
        return result;
    }


}
