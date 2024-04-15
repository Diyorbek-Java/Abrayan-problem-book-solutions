package SeriesSolutions;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements.
                Find the sum of the values of all elements for each given sequence.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        System.out.print("Enter the number (N): ");
        int N = scanner.nextInt();

        for (int k = 0; k < K; k++) {
            int sequenceSum = 0;
            System.out.println("Enter sequence " + (k + 1) + ":");
            for (int i = 0; i < N; i++) {
                sequenceSum += scanner.nextInt();
            }
            System.out.println("Sum of elements in sequence " + (k + 1) + ": " + sequenceSum);
        }
        scanner.close();
    }
}
