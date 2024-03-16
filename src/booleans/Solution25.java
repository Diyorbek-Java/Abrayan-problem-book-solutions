package booleans;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution works for identifying (A,B) points located at second quarter or not");
        System.out.print("Enter points coordinate A: ");
        int a = scanner.nextInt();
        System.out.print("Enter points coordinate B: ");
        int b = scanner.nextInt();
        if (a < 0 && b > 0) {
            System.out.printf("Point (%d,%d) is located in second coordinate quarter", a, b);
        } else {
            System.out.printf("Point (%d,%d) is not located in second coordinate quarter", a, b);
        }

    }


}
