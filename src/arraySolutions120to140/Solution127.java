package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer L (> 0) and an array of N integers are given. Replace each series,
                whose length is equal to L, by one element with zero value (see the series definition in Array116).
                """);

        System.out.print("Enter the array size N:  ");
        int n = scanner.nextInt();

        int[] arrayA = new int[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextInt();

        System.out.print("Enter Integer L: ");
        int l = scanner.nextInt();
        scanner.close();


        int[] result = replaceSeries(arrayA, l);
        System.out.println("Modified array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int[] replaceSeries(int[] A, int L) {
        List<int[]> series = findSeries(A);

        for (int[] s : series) {
            if (s[1] > L) {
                int start = s[0];
                for (int i = start; i < start + s[1]; i++) {
                    A[i] = 0;
                }
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

}
