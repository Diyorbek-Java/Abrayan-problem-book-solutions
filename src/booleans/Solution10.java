package booleans;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs two input numbers and it checks Exactly one of the numbers A and B is odd ");
        System.out.print("Enter Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.printf("It is true that exactly one of the numbers A(%d) and B(%d) is odd ", a, b);
        } else {
            System.out.printf("Both inputs are even %d,%d", a, b);
        }
    }

}
