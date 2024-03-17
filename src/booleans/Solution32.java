package booleans;

import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking Right triangle with given three sides A, B, C");
        System.out.println("Please Enter A side: ");
        int sideA = scanner.nextInt();
        System.out.println("Enter B side: ");
        int sideB = scanner.nextInt();
        System.out.println("Enter C side: ");
        int sideC = scanner.nextInt();
        if (isRightTriangle(sideA, sideB, sideC)) {
            System.out.printf("The triangle with sides A = %d,B = %d, C = %d is right Triangle", sideA, sideB, sideC);
        } else {
            System.out.printf("The triangle with sides A = %d,B = %d, C = %d is right Triangle", sideA, sideB, sideC);
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return c * c == b * b + a * a;
    }


}
