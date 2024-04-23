package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution124 {
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

        System.out.print("Enter Integer K: ");
        int k = scanner.nextInt();
        scanner.close();


        int[] result = exchangeSeries(arrayA, k);
        System.out.println("Modified array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int[] exchangeSeries(int[] A, int K) {
        List<int[]> series = findSeries(A);

        if (series.size() < K) {
            return A; // Do nothing if there are less than K series
        }

        // Find the indices of the last series and the K-th series
        int lastSeriesIndex = series.size() - 1;
        int kthSeriesIndex = K - 1;

        // Find the starting and ending indices of the last and K-th series
        int lastSeriesStart = sumLengths(series.subList(0, lastSeriesIndex));
        int kthSeriesStart = sumLengths(series.subList(0, kthSeriesIndex));
        int kthSeriesEnd = kthSeriesStart + series.get(kthSeriesIndex)[1];

        // Exchange the elements of the last and K-th series
        exchangeElements(A, lastSeriesStart, lastSeriesStart + series.get(lastSeriesIndex)[1],
                A, kthSeriesStart, kthSeriesEnd);

        return A;
    }

    public static List<int[]> findSeries(int[] A) {
        List<int[]> series = new ArrayList<>();
        int currentLength = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                currentLength++;
            } else {
                series.add(new int[]{A[i - 1], currentLength});
                currentLength = 1;
            }
        }

        series.add(new int[]{A[A.length - 1], currentLength});
        return series;
    }

    public static int sumLengths(List<int[]> series) {
        int sum = 0;
        for (int[] s : series) {
            sum += s[1];
        }
        return sum;
    }

    public static void exchangeElements(int[] src, int srcStart, int srcEnd, int[] dest, int destStart, int destEnd) {
        for (int i = srcStart, j = destStart; i < srcEnd && j < destEnd; i++, j++) {
            int temp = src[i];
            src[i] = dest[j];
            dest[j] = temp;
        }
    }

}
