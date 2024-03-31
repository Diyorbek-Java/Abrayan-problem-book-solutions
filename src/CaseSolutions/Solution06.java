package CaseSolutions;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                The units of length are numbered as: 1 — decimeter, 2 — kilometer, 3 — meter, 4 — millimeter, 5 — centimeter.
                The order number N of a unit of length and also the length L of a segment are given
                (N is an integer in the range 1 to 5, L is a real number). Output the length of the segment in meters.
                """);
        System.out.print("Enter the order number of the unit of weight (1 — decimeter, 2 — kilometer, 3 — meter, 4 — millimeter, 5 — centimeter):");
        int unit = scanner.nextInt();
        if (unit > 6) {
            System.out.println("The limit is given it unit should be less than 5");
            return;
        }
        System.out.print("Enter the length number: ");
        double length = scanner.nextDouble();
        String unitName = switch (unit) {
            case 1 -> "decimeter";
            case 2 -> "kilometer";
            case 3 -> "meter";
            case 4 -> "millimeter";
            case 5 -> "centimeter";
            default -> "Wrong";
        };
        double lengthInMeter = changeMeter(unit, length);
        System.out.printf("So %s %s is equal to %s meter", length, unitName, lengthInMeter);
    }

    public static double changeMeter(int unit, double length) {
        return switch (unit) {
            case 1 -> length / 10;
            case 2 -> length * 1000;
            case 3 -> length;
            case 4 -> length / 1000;
            case 5 -> length / 100;
            default -> 0;
        };
    }
}
