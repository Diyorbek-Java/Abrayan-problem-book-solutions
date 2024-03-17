package booleans;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking The triangle with sides a, b, c is equilateral.");
        System.out.println("Enter A: ");
        double sideA = scanner.nextDouble();
        System.out.println("enter B : ");
        double sideB = scanner.nextDouble();
        System.out.println("enter C : ");
        double sideC = scanner.nextDouble();
        if (sideA == sideB && sideB == sideC) {
            System.out.println("The triangle with sides " + sideA + ", " + sideB + ", " + sideC + " is equilateral.");
        } else {
            System.out.println("The triangle with sides " + sideA + ", " + sideB + ", " + sideC + " is not equilateral.");
        }
    }


}
