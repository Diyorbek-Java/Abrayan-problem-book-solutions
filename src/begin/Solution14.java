package begin;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is solution for finding Surface and Radius of the circle with given circumference");
        System.out.print("So insert Circumference to find those: ");
        double circumference = scanner.nextDouble();
        double radius = circumference / (3.14 * 2);
        double surface = Math.pow(radius, 2) * 3.14;
        System.out.printf("So the radius of the circle is R = %s,and the surface = %s", radius, surface);
    }
}
