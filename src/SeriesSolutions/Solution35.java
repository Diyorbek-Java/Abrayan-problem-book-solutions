package SeriesSolutions;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer K and K sequences of nonzero integers are given. Each given sequence is terminated by zero,
                which is not an element of the sequence.
                Output the length of each given sequence. Also output the total length of all given sequences.
                """);
        System.out.print("Enter the number (K): ");
        int K = scanner.nextInt();
        int totalLength = 0;

        for (int i = 0; i < K; i++) {
            int sequenceLength = calculateSequenceLength(scanner);

            System.out.println(sequenceLength);

            totalLength += sequenceLength;
        }

        System.out.println(totalLength);

        scanner.close();
    }
    public static int calculateSequenceLength(Scanner scanner) {
        int sequenceLength = 0;

        int num;
        while ((num = scanner.nextInt()) != 0) {
            sequenceLength++;
        }

        return sequenceLength;
    }


}
