package forSlotions;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A real number A and an integer N (> 0) are given. Using one loop-statement compute the sum\n" +
                "1 + A + A^2 + A^3 + … + A^N.");
        System.out.print("Enter a real number A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 0;
        double powerOfA = 1;
        for (int i = 0; i <= N; i++) {
            sum += powerOfA;
            powerOfA *= A;
        }

        System.out.println("The sum is: " + sum);
    }
}
