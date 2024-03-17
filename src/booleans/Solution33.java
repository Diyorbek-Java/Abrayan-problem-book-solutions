package booleans;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking is it possible to create triangle with given three sides A, B, C");
        System.out.println("Please Enter A side: ");
        int sideA = scanner.nextInt();
        System.out.println("Enter B side: ");
        int sideB = scanner.nextInt();
        System.out.println("Enter C side: ");
        int sideC = scanner.nextInt();
        if (isTriangleExists(sideA, sideB, sideC)) {
            System.out.printf("The triangle with sides A = %d,B = %d, C = %d is exists", sideA, sideB, sideC);
        } else {
            System.out.printf("The triangle with sides A = %d,B = %d, C = %d is not exist", sideA, sideB, sideC);
        }
    }

    public static boolean isTriangleExists(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }


}
