package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. The values of all array elements, except one element, are in descending order.
                Arrange all array elements in descending order by moving the element, that violates ordering, to a new position.
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

        arrangeDescending(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void arrangeDescending(double[] array) {
        int N = array.length;

        int violationIndex = -1;
        for (int i = 0; i < N - 1; i++) {
            if (array[i] < array[i + 1]) {
                violationIndex = i;
                break;
            }
        }
        if (violationIndex == -1) {
            return;
        }
        double violatingElement = array[violationIndex];
        for (int i = violationIndex; i < N - 1; i++) {
            array[i] = array[i + 1];
        }
        array[N - 1] = violatingElement;
        Arrays.sort(array, 0, N - 1);
    }

}
