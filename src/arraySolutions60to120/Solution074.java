package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. Assign zero value to the array
                elements between the minimal element and the maximal element (not including these elements).
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
        double maxValue = array[0];
        int maxIndex = 0;
        double minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
            }
            if (array[i] < minValue) {
                minIndex = i;
            }
        }
        int min = Math.min(minIndex, maxIndex);
        if (min == 0)
            min = 1;
        int max = Math.max(maxIndex, minIndex);
        for (int i = min - 1; i < array.length; i++)
            array[i] = 0;
    }


}
