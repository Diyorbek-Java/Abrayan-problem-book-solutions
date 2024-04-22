package arraySolutions120to140;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K (> 1) and an array of N integers are given. Remove the K-th series of equal numbers from
                the array (see the series definition in Array116). If the array contains less than K series then do not change it.
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        System.out.print("Enter Integer K");
        int k = scanner.nextInt();
        scanner.close();

        int[] modifiedArray = doubleSeriesLength(arrayA, k);


        System.out.println("Modified array:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }

    }

    public static int[] doubleSeriesLength(int[] array, int K) {
        ArrayList<Integer> modifiedList = new ArrayList<>();

        int currentCount = 1;
        int seriesStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            // Check if the current element is equal to the previous element
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                // Check if this is the K-th series
                if (currentCount >= 2 && array[i - 1] == array[seriesStartIndex] && K == 1) {
                    // Double the length of the K-th series by appending its elements twice
                    for (int j = seriesStartIndex; j < i; j++) {
                        modifiedList.add(array[j]);
                        modifiedList.add(array[j]);
                    }
                } else {
                    // Add the elements of the current series to the modified list
                    for (int j = seriesStartIndex; j < i; j++) {
                        modifiedList.add(array[j]);
                    }
                }

                // Update seriesStartIndex and currentCount for the next series
                seriesStartIndex = i;
                currentCount = 1;
            }
        }

        // Add the remaining elements of the last series to the modified list
        for (int i = seriesStartIndex; i < array.length; i++) {
            modifiedList.add(array[i]);
        }

        // Convert ArrayList to array
        int[] modifiedArray = new int[modifiedList.size()];
        for (int i = 0; i < modifiedList.size(); i++) {
            modifiedArray[i] = modifiedList.get(i);
        }

        return modifiedArray;
    }

}
