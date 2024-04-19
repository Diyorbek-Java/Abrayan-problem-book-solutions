package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N integers is given. Write elements of A with even order numbers to
                a new array B and then write elements of A with odd order numbers to the same
                array B, so the array B will contain the following elements:
                A(2),    A(4),    A(6),    …,    A(1),    A(3),    A(5),    … .
                Do not use conditional statements.
                """);
        System.out.println("Enter size of arrays(≤ 15): ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];

        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();
        System.out.println("The given A array ");
        System.out.println(Arrays.toString(arrayA));

        int[] arrayB = getSortedArray(arrayA);
        System.out.println("The created Array B: ");
        System.out.println(Arrays.toString(arrayB));

    }

    public static int[] getSortedArray(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < length; i += 2) {
            result[index] = array[i];
        }
        for (int i = 1; i < length; i += 2) {
            result[index] = array[i];
        }
        return result;
    }
}
