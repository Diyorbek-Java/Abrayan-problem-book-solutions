package SeriesSolutions;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A sequence of nonzero integers terminated by zero is given.
                Output the sum of all elements of the sequence with positive even values.
                If the sequence does not contain the required elements then output 0.
                """);
        System.out.println("Enter the sequence of nonzero integers terminated by zero:");
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("The sum of elements with positive even values: " + sum);

        scanner.close();
    }

}
