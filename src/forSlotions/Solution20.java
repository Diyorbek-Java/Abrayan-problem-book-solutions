package forSlotions;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("An integer N (> 0) is given. Using one loop-statement compute the sum\n" +
                "1! + 2! + 3! + … + N!,\n" +
                "where N! (N–factorial) is the product of all integers in the range 1 to N:    N! = 1·2·…·N. To avoid the integer overflow, compute the sum using real variables and output the result as a real number.");
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double sum = 0;
        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
            sum += factorial;
        }

        System.out.println("The sum of factorials is: " + sum);

    }
}
