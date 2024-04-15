package SeriesSolutions;

import java.util.Scanner;

public class Solution37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K and K sequences of nonzero integers are given.
                Each given sequence contains at least two elements and is terminated by zero, which is not an element of the sequence.
                Output the amount of sequences whose element values are in ascending or in descending order.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        int orderedSequencesCount = 0;

        for (int i = 0; i < K; i++) {
            if (isOrderedSequence(scanner)) {
                orderedSequencesCount++;
            }
        }
        System.out.println(orderedSequencesCount);

        scanner.close();
    }

    public static boolean isOrderedSequence(Scanner scanner) {
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

        return ascending || descending;
    }
}
