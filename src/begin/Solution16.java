package begin;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution works for finding the distance between two points");
        System.out.print("Enter point X1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter point X2: ");
        double x2 = scanner.nextDouble();
        double distance = Math.abs(x1 - x2);
        System.out.printf("The distance between pints %s and %s is %s", x1, x2, distance);
    }
}
