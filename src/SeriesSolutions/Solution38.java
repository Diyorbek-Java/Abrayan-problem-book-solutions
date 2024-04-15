package SeriesSolutions;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K and K sequences of nonzero integers are given.
                Each given sequence contains at least three elements and is terminated by zero, which is not an element of the sequence.
                Output the amount of the sawtooth sequences (see the definition of a sawtooth sequence in Series23)
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int result = processSequence(scanner);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int processSequence(Scanner scanner) {
        int prevNum = scanner.nextInt();
        int num;

        boolean ascending = true;
        boolean descending = true;

        while ((num = scanner.nextInt()) != 0) {
            if (num < prevNum) {
                ascending = false;
            } else if (num > prevNum) {
                descending = false;
            }
            prevNum = num;
        }

        if (ascending) {
            return 1;
        } else if (descending) {
            return -1;
        } else {
            return 0;
        }
    }
}
