package booleans;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs Three input numbers (A,B,C) and checks  Where second number (B) between other two(A,C) ");
        System.out.print("Let's start Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C: ");
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.printf("It is proved that B(%d) is smaller than A(%d) and C(%d) ", b, a, c);
        } else if (a < b && b > c) {
            System.out.printf("So the inputs were not valid for that B(%d) is larger than Both of them (%d,%d) ", b, a, c);
        } else {
            System.out.printf("So The Theory resulted that B(%d) is smaller than both of them(%d,%d) ", b, a, c);
        }
    }

}
