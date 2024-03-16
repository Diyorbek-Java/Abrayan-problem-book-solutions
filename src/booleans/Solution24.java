package booleans;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User gives tree inputs A,B,C and whether the" +
                " solution for Ax^2 + Bx + C = 0 has real roots or not");
        System.out.print("Enter Number A (A != 0): ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C: ");
        int c = scanner.nextInt();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d >= 0) {
            System.out.printf("%d x^2 + %dx + %d = 0 has real root", a, b, c);
        } else {
            System.out.printf("%dx^2 + %dx + %d = 0 has no real root", a, b, c);
        }

    }


}
