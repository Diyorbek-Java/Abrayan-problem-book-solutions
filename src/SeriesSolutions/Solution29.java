package SeriesSolutions;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements.
                Find the total sum of the values of elements of all given sequences.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        System.out.print("Enter the number (N): ");
        int N = scanner.nextInt();

        int totalSum = 0;
        for (int k = 0; k < K; k++) {
            System.out.println("Enter sequence " + (k + 1) + ":");
            for (int i = 0; i < N; i++) {
                totalSum += scanner.nextInt();
            }
        }
        System.out.println("The total sum of the values of elements of all given sequences: " + totalSum);
        scanner.close();
    }
}
