package arraySolutions60to120;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, insert an element with zero value after each series of equal numbers of the array (see the series definition in Array116).
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        scanner.close();

        int[] modifiedArray = insertZeroAfterSeries(arrayA);


        System.out.println("Modified array:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }

    }

    public static int[] insertZeroAfterSeries(int[] array) {
        ArrayList<Integer> modifiedList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            modifiedList.add(array[i]);

            if (i < array.length - 1 && array[i] != array[i + 1]) {
                if (i > 0 && array[i] == array[i - 1]) {
                    modifiedList.add(0);
                }
            }
        }

        int[] modifiedArray = new int[modifiedList.size()];
        for (int i = 0; i < modifiedList.size(); i++) {
            modifiedArray[i] = modifiedList.get(i);
        }

        return modifiedArray;
    }
}
