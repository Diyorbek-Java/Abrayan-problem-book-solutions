package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an array of N integers, increase its first series of the maximal length by one element (see the series definition in Array116).
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();



        int[] result = increaseFirstMaxSeries(arrayA);
        System.out.println("Modified array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int[] increaseFirstMaxSeries(int[] A) {
        List<int[]> series = findSeries(A);

        int maxSeriesLength = 0;
        int maxSeriesStartIndex = 0;
        for (int i = 0; i < series.size(); i++) {
            if (series.get(i)[1] > maxSeriesLength) {
                maxSeriesLength = series.get(i)[1];
                maxSeriesStartIndex = series.get(i)[0];
            }
        }

        int[] newArray = new int[A.length + 1];
        System.arraycopy(A, 0, newArray, 0, maxSeriesStartIndex + maxSeriesLength);
        newArray[maxSeriesStartIndex + maxSeriesLength] = 0;
        System.arraycopy(A, maxSeriesStartIndex + maxSeriesLength, newArray, maxSeriesStartIndex + maxSeriesLength + 1, A.length - maxSeriesStartIndex - maxSeriesLength);

        return newArray;
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
}
