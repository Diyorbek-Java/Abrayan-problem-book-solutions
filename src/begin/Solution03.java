package begin;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A side of the rectangle: ");
        double aSide = scanner.nextDouble();
        System.out.print("Enter B side of the rectangle: ");
        double bSide = scanner.nextDouble();
        double perimeter = 2 * (aSide + bSide);
        double surface = aSide * bSide;
        System.out.printf("the parameter and square of the given Rectangle\n with sides a=%s, b=%s %s and %s respectively", aSide, bSide, perimeter, surface);
    }
}
