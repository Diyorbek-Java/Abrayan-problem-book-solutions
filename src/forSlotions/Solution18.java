package forSlotions;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number A and an integer N (> 0) are given. Using one loop-statement compute the expression\n" +
                "1 − A + A2 − A3 + … + (−1)N·AN.");
        System.out.print("Enter a real number A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double result = 0;
        double sign = 1;
        for (int i = 0; i <= N; i++) {
            result += sign * Math.pow(A, i);
            sign *= -1;
        }

        System.out.println("The result is: " + result);
    }
}
