package SeriesSolutions;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and K sequences of integers are given. Each given sequence contains N elements.
                Output the order number of the last element with the value 2 for each given sequence
                (if a sequence does not contain elements with the required value then output 0).
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

            int orderNumber = findLastOrderNumber(sequence);
            System.out.println(orderNumber);
        }


        scanner.close();
    }

    public static int findLastOrderNumber(int[] sequence) {
        int orderNumber = 0;
        for (int i = sequence.length - 1; i >= 0; i--) {
            if (sequence[i] == 2) {
                orderNumber = i + 1;
                break;
            }
        }
        return orderNumber;
    }

}
