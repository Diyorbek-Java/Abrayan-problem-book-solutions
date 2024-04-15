package SeriesSolutions;

import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements.
                Output the order number of the first element with the value 2 for each given
                sequence (if a sequence does not contain elements with the required value then output 0).
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

            int orderNumber = findOrderNumber(sequence);
            System.out.println(orderNumber);
        }


        scanner.close();
    }

    public static int findOrderNumber(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == 2) {
                return i + 1;
            }
        }
        return 0;
    }

}
