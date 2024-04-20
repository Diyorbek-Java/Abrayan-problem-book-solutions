package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array of N integers is given. Increase all odd numbers contained in the array by the initial
                value of the last odd number in the array. If the array does not contain odd numbers then do not change it.
                """);
        System.out.print("Enter the array size N: ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        changeElements(arrayA);
        System.out.println("Changed array elements: ");
        System.out.println(Arrays.toString(arrayA));


    }

    public static void changeElements(int[] array) {
        int lastOdd = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                lastOdd = array[i];
                break;
            }
        }
        if (lastOdd == -1) {
            System.out.println("No odd numbers found in the array.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += lastOdd;
            }
        }
    }


}
