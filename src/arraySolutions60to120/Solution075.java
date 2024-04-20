package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N real numbers is given. Change the order of the array elements between
                the minimal element and the maximal element (including these elements) to inverse one.
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
        int minIndex = 0;
        int maxIndex = 0;
        double minValue = array[0];
        double maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        while (minIndex < maxIndex) {
            double temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;


            minIndex++;
            maxIndex--;
        }

    }


}
