package forSlotions;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number X and an integer N (> 0) are given. Compute the expression\n" +
                "X − X3/(3!) + X5/(5!) − … + (−1)N·X2·N+1/((2·N+1)!)\n" +
                "(N! = 1·2·…·N). The result is an approximate value of sin(X).");
        System.out.print("Enter a real number X: ");
        double X = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 0;
        double sign = 1;
        double term = X;
        double factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= (2 * i) * (2 * i + 1);
            term = Math.pow(X, 2 * i + 1) / factorial;
            sum += sign * term;
            sign *= -1;
        }

        System.out.println("The approximate value of sin(" + X + ") is: " + sum);

    }
}
