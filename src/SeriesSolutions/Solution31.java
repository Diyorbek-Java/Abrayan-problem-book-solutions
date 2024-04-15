package SeriesSolutions;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements.
                Find the amount of the sequences containing an element with the value 2.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        System.out.print("Enter the number (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the element to search for: ");
        int elementToSearch = scanner.nextInt();

        int[][] sequences = new int[K][N];
        for (int i = 0; i < K; i++) {
            System.out.println("Enter sequence " + (i + 1) + ":");
            for (int j = 0; j < N; j++) {
                sequences[i][j] = scanner.nextInt();
            }
        }

        int sequencesWithElement = countSequencesWithElement(sequences, elementToSearch);

        System.out.println("Amount of sequences containing element " + elementToSearch + ": " + sequencesWithElement);

        scanner.close();
    }
    public static int countSequencesWithElement(int[][] sequences, int element) {
        int count = 0;
        for (int i = 0; i < sequences.length; i++) {
            for (int j = 0; j < sequences[i].length; j++) {
                if (sequences[i][j] == element) {
                    count++;
                    break; // Break out of inner loop if element is found in the current sequence
                }
            }
        }
        return count;
    }
}
