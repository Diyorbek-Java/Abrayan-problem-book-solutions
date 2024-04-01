package forSlotions;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (> 0), find the value of the following expression of N terms with alternating signs:\n" +
                "1.1 − 1.2 + 1.3 − … .");
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        double result = 0.0;
        double sign = 1.0;

        for (int i = 1; i <= n; i++) {
            double term = 1.0 + (double) i / 10;
            result += sign * term;
            sign *= -1.0;
        }

        System.out.println("Value of the expression: " + result);
    }
}
