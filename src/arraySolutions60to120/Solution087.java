package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. The values of all array elements, except the first one, are in ascending order.
                Arrange all array elements in ascending order by moving the first element to a new position.
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

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array) {
        double firstElement = array[0];
        int n = array.length;

        int insertIndex = 1;
        while (insertIndex < n && array[insertIndex] < firstElement) {
            insertIndex++;
        }
        for (int i = 0; i < insertIndex - 1; i++) {
            array[i] = array[i + 1];
        }

        array[insertIndex - 1] = firstElement;
    }

}
