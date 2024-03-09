package begin;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution is for finding the diameter of the circle using surface of it");
        System.out.print("So enter surface of the circle S = ");
        double surface = scanner.nextDouble();
        double diameter = Math.sqrt((surface * 4) / 3.14);
        double length = diameter * 3.14;
        System.out.printf("So the circle with surface = %s, have diameter = %s and length = %s", surface, diameter, length);
    }
}
