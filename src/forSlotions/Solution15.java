package forSlotions;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a real number A and an integer N (> 0), find A raised to the power N (i. e., the product of N values of A):\n" +
                "A^N = A·A· … ·A.");
        System.out.print("Enter number A: ");
        int a = scanner.nextInt();
        System.out.println("Enter number N: ");
        int n = scanner.nextInt();
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= a;
        }
        System.out.printf("according to formula A^N = A*A*A*..*A %d power of %d is equal to %d", a, n, product);
    }
}
