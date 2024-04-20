package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers and two integers K and L (1 ≤ K < L ≤ N) are given.
                Change the order of the array elements between AK and AL (including these elements) to inverse one.
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

        changeElements(arrayA, k, l);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(double[] array, int k, int l) {
        while (k < l) {
            // Swap elements at K and L positions
            double temp = array[k - 1];
            array[k - 1] = array[l - 1];
            array[l - 1] = temp;

            // Move to the next pair of elements
            k++;
            l--;
        }

    }


}
