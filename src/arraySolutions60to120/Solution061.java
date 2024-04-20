package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given. Create a new array B of the same size;
                each array element B(K) must be equal to the average of elements of A with the order numbers in the range K to N.
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

        double[] arrayB = getSortedArray(arrayA);
        System.out.println("The created Array B: ");
        System.out.println(Arrays.toString(arrayB));

    }

    public static double[] getSortedArray(double[] array) {
        int length = array.length;
        double[] result = new double[length];
        int index = 0;
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                sum += j;
                counter++;
            }
            result[index] = (array[i] + sum) / counter;
            sum = 0;
            counter = 0;
        }
        return result;
    }
}
