package arraySolutions60to120;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, remove all equal elements (except for their first occurrence) from the array.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arrayA));

        arrayA = removeSuccessiveEqualElements(arrayA);
        System.out.printf("The worked array size is %d and Elements are ", arrayA.length);
        System.out.println(Arrays.toString(arrayA));
    }

    public static int[] removeSuccessiveEqualElements(int[] array) {

        Set<Integer> occurred = new HashSet<>();

        for (int i = array.length - 1; i >= 0; i--) {
            if (!occurred.contains(array[i])) {
                occurred.add(array[i]);
            } else {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                int[] newArray = new int[array.length - 1];
                System.arraycopy(array, 0, newArray, 0, newArray.length);
                array = newArray;
            }
        }

        return array;
    }
}
