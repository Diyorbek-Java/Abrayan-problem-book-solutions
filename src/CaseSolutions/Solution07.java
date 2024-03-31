package CaseSolutions;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                The units of weight are numbered as: 1 — kilogram, 2 — milligram, 3 — gram, 4 — ton, 5 — centner (= 100 kilograms).
                The order number N of a unit of weight and the mass M of a solid are given
                (N is an integer in the range 1 to 5, M is a real number). Output the mass of the solid in kilograms.
                """);
        System.out.print("Enter the order number of the unit of weight (1 — kilogram, 2 — milligram, 3 — gram, 4 — ton, 5 — centner):");
        int unit = scanner.nextInt();
        if (unit > 6) {
            System.out.println("The limit is given it unit should be less than 5");
            return;
        }
        System.out.print("Enter the weight number: ");
        double weight = scanner.nextDouble();
        String unitName = switch (unit) {
            case 1 -> "kilogram";
            case 2 -> "milligram";
            case 3 -> "gram";
            case 4 -> "ton";
            case 5 -> "center";
            default -> "Wrong";
        };
        double weightInKilogram = changeMeter(unit, weight);
        System.out.printf("So %s %s is equal to %s kilogram", weight, unitName, weightInKilogram);
    }

    public static double changeMeter(int unit, double weight) {
        return switch (unit) {
            case 1 -> weight;
            case 2 -> weight / 1000000;
            case 3 -> weight / 1000;
            case 4 -> weight * 1000;
            case 5 -> weight * 100;
            default -> 0;
        };
    }
}
