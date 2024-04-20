package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given. Without changing the array A, output the order numbers that correspond
                to array elements in ascending order of their values. For solving the task create an additional index array I,
                which contains order numbers in the range 1 to N, and use the bubble sorting (see Array112) as follows: compare
                elements of array A (with the order numbers I1 and I2, I2 and I3, and so on) and exchange, if necessary, values
                of corresponding elements of index array I. After repeating N − 1 times of such array pass the required sequence
                of order numbers will be contained in the array I.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        scanner.close();

        int[] result = bubbleSortIndices(arrayA);
        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(result));


    }

    public static int[] bubbleSortIndices(double[] array) {
        int n = array.length;
        int[] indices = new int[n];
        for (int i = 0; i < n; i++)
            indices[i] = i + 1;


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (array[indices[j] - 1] > array[indices[j + 1] - 1]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }
        return indices;
    }
}
