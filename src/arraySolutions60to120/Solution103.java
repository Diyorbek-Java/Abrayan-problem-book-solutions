package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. Insert new elements with zero value before an element
                with the minimal value and after an element with the maximal value
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = insertMinMaxElements(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static double[] insertMinMaxElements(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        double[] newArray = new double[array.length + 2];

        for (int i = 0; i < minIndex; i++)
            newArray[i] = array[i];


        newArray[minIndex] = 0;

        for (int i = minIndex + 1, j = minIndex + 1; i < maxIndex; i++, j++)
            newArray[j] = array[i];


        newArray[maxIndex + 1] = 0;

        for (int i = maxIndex + 1, j = maxIndex + 2; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }

        return newArray;
    }
}
