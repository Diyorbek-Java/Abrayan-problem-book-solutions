package begin;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the side of a Square: ");
        double aSide = scanner.nextDouble();
        double perimeter = aSide * 4;
        System.out.printf("Perimeter of the square with side=%s is %s", aSide, perimeter);
    }
}
