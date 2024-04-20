package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. The values of all array elements, except the last one, are in ascending order.
                Arrange all array elements in ascending order by moving the last element to a new position.
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

        arrangeAscending(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void arrangeAscending(double[] array) {
        int n = array.length;
        double lastElement = array[n - 1];

        int insertIndex = n - 1;
        while (insertIndex > 0 && array[insertIndex - 1] > lastElement) {
            insertIndex--;
        }
        for (int i = n - 1; i > insertIndex; i--) {
            array[i] = array[i - 1];
        }

        array[insertIndex] = lastElement;
    }

}
