package forSlotions;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number X (|X| < 1) and an integer N (> 0) are given. Compute the expression\n" +
                "X − X^2/2 + X^3/3 − … + (−1)N−1·X^N/N.\n" +
                "The result is an approximate value of ln(1 + X).");
        System.out.print("Enter a real number X (|X| < 1): ");
        double X = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 0;
        double term;

        for (int i = 1; i <= N; i++) {
            term = Math.pow(-1, i - 1) * Math.pow(X, i) / i; // Calculate term
            sum += term;
        }

        System.out.println("The approximate value of ln(1 + " + X + ") is: " + sum);


    }
}
