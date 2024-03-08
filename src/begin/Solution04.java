package begin;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        double diameter = scanner.nextDouble();
        double length = diameter * 3.14;
        System.out.printf("The Length of the Circle with diameter = %s is %s", diameter, length);
    }
}
