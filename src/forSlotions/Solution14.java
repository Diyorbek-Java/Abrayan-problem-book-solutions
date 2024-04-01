package forSlotions;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (N> 0), compute N2 by means of the formula\n" +
                "N^2 = 1 + 3 + 5 + … + (2·N − 1).");
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int mean = 1;
        int counter = -1;
        for (int i = 0; i <= n; i++) {
            mean += counter;
            counter += 2;
        }
        System.out.printf("according to formula N^2 = 1+3++...(2*n-1) %d is equal to %d", n, mean);
    }
}
