package SeriesSolutions;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 2) and a sequence of N real numbers are given. A sequence is called a sawtooth one if
                each inner element of the sequence is either greater or less than both of its neighbors (that is, each inner element is a tooth).
                Output 0 if the given sequence is a sawtooth one, otherwise output the order number of the first element that is not a tooth.
                """);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of real numbers:");
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        int orderNumber = 0;
        for (int i = 1; i < N - 1; i++) {
            if (!((sequence[i] > sequence[i - 1] && sequence[i] > sequence[i + 1]) ||
                    (sequence[i] < sequence[i - 1] && sequence[i] < sequence[i + 1]))) {
                orderNumber = i + 1;
                break;
            }
        }

        System.out.println(orderNumber == 0 ? "0" : orderNumber);
        scanner.close();
    }
}
