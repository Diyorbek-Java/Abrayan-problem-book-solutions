package forSlotions;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number X and an integer N (> 0) are given. Compute the expression\n" +
                "1 + X + X^2/(2!) + … + X^N/(N!)\n" +
                "(N! = 1·2·…·N). The result is an approximate value of exp(X).");
        System.out.print("Enter a real number X: ");
        double X = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 1;
        double term = 1;
        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            term *= X;
            factorial *= i;
            sum += term / factorial;
        }

        System.out.println("The approximate value of exp(" + X + ") is: " + sum);

    }
}
