package forSlotions;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (> 0), find the value of a following sum (as an integer):\n" +
                "N^2 + (N + 1)^2 + (N + 2)^2 + … + (2·N)^2");
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(n + i, 2);
        }
        System.out.printf("The given number was %d sum of 1 + 1/2 + 1/3 + … + 1/N. value is %d", n, (int) sum);
    }
}
