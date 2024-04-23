package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, increase all its series of the maximal length by one element (see the series definition in Array116).
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();



        int[] result = increaseMaxSeries(arrayA);
        System.out.println("Modified array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int[] increaseMaxSeries(int[] A) {
        List<int[]> series = findSeries(A);

        // Find the series with maximal length
        int maxSeriesLength = 0;
        for (int[] s : series) {
            if (s[1] > maxSeriesLength) {
                maxSeriesLength = s[1];
            }
        }

        for (int[] s : series) {
            if (s[1] == maxSeriesLength) {
                A = increaseSeries(A, s[0], s[1]);
            }
        }

        return A;
    }

    public static List<int[]> findSeries(int[] A) {
        List<int[]> series = new ArrayList<>();
        int currentLength = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                currentLength++;
            } else {
                series.add(new int[]{i - currentLength, currentLength});
                currentLength = 1;
            }
        }

        series.add(new int[]{A.length - currentLength, currentLength});
        return series;
    }

    public static int[] increaseSeries(int[] A, int startIndex, int length) {
        int[] newArray = new int[A.length + 1];
        System.arraycopy(A, 0, newArray, 0, startIndex + length);
        newArray[startIndex + length] = 0;
        System.arraycopy(A, startIndex + length, newArray, startIndex + length + 1, A.length - startIndex - length);
        return newArray;
    }
}
