package SeriesSolutions;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a procedure InvDigits(K) that inverts the order of digits of a positive integer
                K (K is an input and output integer parameter). Using this procedure, invert the order of digits for each of five given integers.
                """);

        System.out.println("Enter Five integer numbers:");
        int[] sequence = new int[5];
        for (int i = 0; i < 5; i++) {
            sequence[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Original number: " + sequence[i]);
            InvDigits(sequence, i);
            System.out.println("The inverted number: " + sequence[i]);
        }


        scanner.close();
    }

    public static void InvDigits(int[] K, int index) {
        int number = K[index];
        int invertedNumber = 0;

        while (number > 0) {
            invertedNumber = invertedNumber * 10 + (number % 10);
            number /= 10;
        }

        K[index] = invertedNumber;
    }
}
