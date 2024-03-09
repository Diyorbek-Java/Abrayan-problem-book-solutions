package begin;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the r(Radius) of the Circle: ");
        double radius = scanner.nextDouble();
        double length = Math.round(2 * Math.PI * radius);
        double surface = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Circle with radius = %s, have lange = %s,and surface = %s", radius, length, surface);

    }
}
