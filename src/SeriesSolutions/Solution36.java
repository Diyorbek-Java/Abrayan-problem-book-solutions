package SeriesSolutions;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K and K sequences of nonzero integers are given.
                Each given sequence contains at least two elements and is terminated by zero, which is not an element of the sequence.
                Output the amount of the sequences whose element values are in ascending order.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        int sequencesCount = 0;

        for (int i = 0; i < K; i++) {
            if (isAscendingSequence(scanner)) {
                sequencesCount++;
            }
        }
        System.out.println(sequencesCount);

        scanner.close();
    }

    public static boolean isAscendingSequence(Scanner scanner) {
        int prevNum = scanner.nextInt();
        int num;

        while ((num = scanner.nextInt()) != 0) {
            if (num <= prevNum) {
                return false;
            }
            prevNum = num;
        }
        return true;
    }
}
