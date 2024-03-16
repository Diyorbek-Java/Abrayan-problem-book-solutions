package booleans;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs Three input numbers and checks A < B < C inequalities");
        System.out.print("Let's start Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C: ");
        int c = scanner.nextInt();
        boolean aCheck = a < b;
        boolean bCheck = b < c;
        if (aCheck && bCheck) {
            System.out.printf("Inequalities are True %d(A) < %d(B) < %d(C) ", a, b, c);
        } else {
            System.out.printf("Inequalities are Failed %d(A) < %d(B) < %d(C) ", a, b, c);
        }
    }

}
