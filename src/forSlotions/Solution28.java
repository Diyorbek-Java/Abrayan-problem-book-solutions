package forSlotions;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number X (|X| < 1) and an integer N (> 0) are given. Compute the expression\n" +
                "1 + X/2 − 1·X^2/(2·4) + 1·3·X^3/(2·4·6) − … +\n" +
                "+ (−1)^(N−1)·1·3·…·(2·N−3)·X^N/(2·4·…·(2·N)).\n" +
                "The result is an approximate value of the square root of 1 + X.");
        System.out.print("Enter a real number X (|X| < 1): ");
        double X = scanner.nextDouble();


        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();


        double sum = 1;

        double numerator = 1;
        double denominator = 2;

        for (int i = 1; i <= N; i++) {
            numerator *= (2 * i - 1);
            denominator *= (2 * i);
            sum += Math.pow(-1, i) * (numerator * Math.pow(X, i)) / denominator;
        }

        System.out.println("The approximate value of √(1 + " + X + ") is: " + sum);

    }
}
