package booleans;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs two input numbers and it checks both numbers odd or not   ");
        System.out.print("Let's start Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.printf("Both inputs are odd %d, %d ", a, b);
        } else {
            System.out.printf("either or both of them not odd %d,%d ", a, b);
        }
    }

}
