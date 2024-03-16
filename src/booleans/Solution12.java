package booleans;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs two input numbers and it checks Exactly one of the numbers A and B is odd ");
        System.out.print("Enter Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
            System.out.printf("Both inputs %d,%d has equal parity ", a, b);
        } else {
            System.out.printf("Both inputs different %d,%d", a, b);
        }
    }

}
