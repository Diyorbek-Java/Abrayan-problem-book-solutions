package forSlotions;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("An integer N (> 0) is given. Using one loop-statement compute the sum\n" +
                "1 + 1/(1!) + 1/(2!) + 1/(3!) + … + 1/(N!),\n" +
                "where N! (N–factorial) is the product of all integers in the range 1 to N:    N! = 1·2·…·N. The result is an approximate value of the constant e = exp(1).");
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 0;
        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }
        sum += 1;

        System.out.println("The approximate value of e is: " + sum);
    }
}
