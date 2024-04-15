package SeriesSolutions;

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K and K sequences of nonzero integers are given.
                Each given sequence contains at least three elements and is terminated by zero, which is not an element of the sequence.
                Output the amount of the sawtooth sequences (see the definition of a sawtooth sequence in Series23)
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();

        int sequencesCount = 0;


        for (int i = 0; i < K; i++) {
            if (isSawtoothSequence(scanner)) {
                sequencesCount++;
            }
        }

        System.out.println(sequencesCount);
        scanner.close();
    }

    public static boolean isSawtoothSequence(Scanner scanner) {
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int prevDiff = secondNum - firstNum;
        int num;

        while ((num = scanner.nextInt()) != 0) {
            int diff = num - secondNum;

            if ((prevDiff >= 0 && diff < 0) || (prevDiff <= 0 && diff > 0) || diff == 0) {
                return false;
            }

            prevDiff = diff;
            secondNum = num;
        }

        return true;
    }
}
