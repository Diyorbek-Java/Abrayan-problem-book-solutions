package forSlotions;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A real number X (|X| < 1) and an integer N (> 0) are given. Compute the expression\n" +
                "X + 1·X3/(2·3) + 1·3·X5/(2·4·5) + … +\n" +
                "+ 1·3·…·(2·N−1)·X2·N+1/(2·4·…·(2·N)·(2·N+1)).\n" +
                "The result is an approximate value of asin(X).");
        System.out.print("Enter a real number X (|X| < 1): ");
        double X = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = X;

        double numerator = 1;
        double denominator = 2;

        for (int i = 1; i <= N; i++) {
            numerator *= (2 * i - 1);
            denominator *= (2 * i) * (2 * i + 1);
            sum += (numerator * Math.pow(X, 2 * i + 1)) / denominator;
        }

        System.out.println("The approximate value of asin(" + X + ") is: " + sum);

    }
}
