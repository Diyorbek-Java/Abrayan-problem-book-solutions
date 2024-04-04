package forSlotions;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A real number X and an integer N (> 0) are given. Compute the expression\n" +
                "1 − X2/(2!) + X4/(4!) − … + (−1)N·X2·N/((2·N)!)\n" +
                "(N! = 1·2·…·N). The result is an approximate value of cos(X).");
        System.out.print("Enter a real number X: ");
        double X = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();


        double sum = 1;
        double sign = -1;
        double term;
        double factorial;

        for (int i = 1; i <= N; i++) {
            factorial = factorial(2 * i);
            term = Math.pow(X, 2 * i) / factorial;
            sum += sign * term;
            sign *= -1;
        }

        System.out.println("The approximate value of cos(" + X + ") is: " + sum);

    }
    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
