package booleans;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution works for identifying (A,B) points located at first or fourth coordinate quarter or not");
        System.out.print("Enter points coordinate A: ");
        int a = scanner.nextInt();
        System.out.print("Enter points coordinate B: ");
        int b = scanner.nextInt();
        if (a > 0) {
            System.out.printf("Point (%d,%d) is located in first or fourth coordinate quarter", a, b);
        } else {
            System.out.printf("Point (%d,%d) is not located in first nor fourth coordinate quarter", a, b);
        }
    }


}
