package booleans;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs three input numbers and it checks exactly one of them positive");
        System.out.print("Enter Number A : ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C: ");
        int c = scanner.nextInt();
        boolean result = exactlyOnePositive(a, b, c);
        System.out.printf("Exactly one of the numbers %d(A), %d(B), %d(C) is positive:" + result, a, b, c);
    }

    public static boolean exactlyOnePositive(int a, int b, int c) {
        return (a > 0 && b <= 0 && c <= 0) || (b > 0 && a <= 0 && c <= 0) || (c > 0 && a <= 0 && b <= 0);
    }

}
