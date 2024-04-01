package forSlotions;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (> 0), find the value of a following sum (as a real number):\n" +
                "1 + 1/2 + 1/3 + … + 1/N.");
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        System.out.printf("The given number was %d sum of 1 + 1/2 + 1/3 + … + 1/N. value is %s", n, sum);
    }
}
