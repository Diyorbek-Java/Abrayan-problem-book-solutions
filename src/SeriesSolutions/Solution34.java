package SeriesSolutions;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements. Process each sequence as follows:
                output the sum of the values of all its elements if the sequence contains an element with the value 2, otherwise output 0.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        System.out.print("Enter the number (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int[] sequence = new int[N];
            for (int j = 0; j < N; j++) {
                sequence[j] = scanner.nextInt();
            }

            int result = processSequence(sequence);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int processSequence(int[] sequence) {
        boolean containsTwo = false;
        int sum = 0;

        for (int num : sequence) {
            sum += num;
            if (num == 2) {
                containsTwo = true;
            }
        }

        return containsTwo ? sum : 0;
    }

}
