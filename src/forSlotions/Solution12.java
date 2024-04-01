package forSlotions;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (> 0), find the value of a following product of N factors:\n" +
                "1.1 · 1.2 · 1.3 · … .");
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        BigDecimal product = BigDecimal.ONE;
        for (int i = 0; i <= n; i++) {
            BigDecimal factor = BigDecimal.valueOf(1.0 + (double) i / 10);
            product = product.multiply(factor);
        }
        System.out.println("Product of the factors: " + product);
    }
}
