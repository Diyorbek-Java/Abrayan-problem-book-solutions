package booleans;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs three input numbers and it checks all of them positive");
        System.out.print("Enter Number A please: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C: ");
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            System.out.printf("All given number are positive %d,%d,%d", a, b, c);
        } else {
            System.out.printf("either of them is not positive or equal to zero %d,%d,%d", a, b, c);
        }
    }

}
