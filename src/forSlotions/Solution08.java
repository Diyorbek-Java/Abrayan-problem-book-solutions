package forSlotions;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given two integers A and B (A < B), find the sum of all integers in the range A to B inclusive");
        System.out.print("Enter number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter number B: ");
        int b = scanner.nextInt();
        int product = 1;
        for (int i = a; i <= b; i++) {
            product *= i;
        }
        System.out.printf("Product of numbers from %d to %d () is %d", a, b, product);
    }
}
