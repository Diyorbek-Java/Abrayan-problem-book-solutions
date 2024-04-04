package forSlotions;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (> 0), find the value of a following product:\n" +
                "N! = 1·2·…·N\n" +
                "(N–factorial). To avoid the integer overflow, compute the product using a real variable and output the result as a real number.");
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + N + " is: " + factorial);
    }
}
