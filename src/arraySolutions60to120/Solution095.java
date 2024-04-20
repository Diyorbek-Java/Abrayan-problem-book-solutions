package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, remove all successive equal elements
                    (except for their first occurrence) from the array.
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

        List<Integer> resultList = new ArrayList<>();
        resultList.add(array[0]);

        // Iterate through the array and add elements to the list
        // only if they are different from the previous element
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                resultList.add(array[i]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }


}
