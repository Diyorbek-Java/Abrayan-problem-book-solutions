package forSlotions;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0), find the sum
                1^N + 2^(N−1) + … + N^1.
                To avoid the integer overflow, compute the sum using real variables and output the result as a real number.
                """);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= N; i++) {
            double term = 0;
            double power = N - i + 1;
            for (int j = 1; j <= i; j++) {
                term += Math.pow(j, power);
            }
            sum += term;
        }
        System.out.println("The sum is: " + sum);
    }
}
