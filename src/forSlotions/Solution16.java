package forSlotions;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number A and an integer N (> 0) are given." +
                "\nUsing one loop-statement compute and output powers A^K" +
                "\nfor all integer exponents K in the range 1 to N.");
        System.out.print("Enter a real number A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        for (int K = 1; K <= N; K++) {
            double result = Math.pow(A, K);
            System.out.println(A + " raised to the power of " + K + " is: " + result);
        }
    }
}
