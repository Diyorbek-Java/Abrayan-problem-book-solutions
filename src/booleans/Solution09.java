package booleans;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs two input numbers and it checks either one of numbers odd or not ");
        System.out.print("Let's start Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.printf("both of inputs are even %d, %d ", a, b);
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.printf("Either of them is even %d,%d", a, b);
        } else if (a % 2 != 0) {
            System.out.printf("Input %d(B) is odd and input %d(A) is even ", a, b);
        } else {
            System.out.printf("Input %d(A) is odd and input %d(B) is even", a, b);
        }
    }

}
