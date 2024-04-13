package SeriesSolutions;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A sequence of nonzero integers terminated by zero is given (the final zero is not an element of the sequence).
                Output the length of the sequence.
                """);
        System.out.println("Enter the sequence of nonzero integers terminated by zero:");
        int length = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            length++;
        }

        System.out.println("The length of the sequence: " + length);

        scanner.close();
    }

}
