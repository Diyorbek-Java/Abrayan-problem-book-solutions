package arraySolutions60to120;

import java.util.*;

public class Solution096 {
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


        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (!occurred.contains(array[i])) {
                occurred.add(array[i]);
                array[uniqueCount++] = array[i];
            }
        }

        int[] resultArray = new int[uniqueCount];
        System.arraycopy(array, 0, resultArray, 0, uniqueCount);

        return resultArray;
    }
}
