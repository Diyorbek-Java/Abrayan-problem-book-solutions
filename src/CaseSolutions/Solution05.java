package CaseSolutions;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                The units of length are numbered as: 1 — decimeter, 2 — kilometer, 3 — meter, 4 — millimeter, 5 — centimeter.
                The order number N of a unit of length and also the length L of a segment are given
                (N is an integer in the range 1 to 5, L is a real number). Output the length of the segment in meters.
                """);
        System.out.print("Enter the order number of the arithmetic operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division):");
        int operation = scanner.nextInt();

        System.out.print("Enter the first real number (A):");
        double a = scanner.nextDouble();

        System.out.print("Enter the second real number (B):");
        double b = scanner.nextDouble();
        String operationName = switch (operation) {
            case 1 -> "Addition";
            case 2 -> "Subtraction";
            case 3 -> "multiplication";
            case 4 -> "division";
            default -> "Wrong";
        };
        double result = performOperation(operation, a, b);
        System.out.printf("So the numbers are %s,%s and chosen operation is %s , The result is %s ", a, b, operationName, result);
    }

    public static double performOperation(int operation, double A, double B) {
        double result = 0;

        switch (operation) {
            case 1:
                result = A + B;
                break;
            case 2:
                result = A - B;
                break;
            case 3:
                result = A * B;
                break;
            case 4:
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation number.");
        }

        return result;
    }
}
