package booleans;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking The triangle with sides a, b, c is isosceles");
        System.out.println("Enter A: ");
        int sideA = scanner.nextInt();
        System.out.println("enter B : ");
        int sideB = scanner.nextInt();
        System.out.println("enter C : ");
        int sideC = scanner.nextInt();
        if (isIsosceles(sideA, sideB, sideC)) {
            System.out.println("The triangle with sides " + sideA + ", " + sideB + ", " + sideC + " is isosceles.");
        } else {
            System.out.println("The triangle with sides " + sideA + ", " + sideB + ", " + sideC + " is not isosceles.");
        }
    }

    public static boolean isIsosceles(int a, int b, int c) {
        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }


}
