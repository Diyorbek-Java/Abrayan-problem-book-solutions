package CaseSolutions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Elements of a circle are numbered as: 1 — radius R, 2 — diameter D = 2·R, 3 — length L = 2·π·R of the circumference, 4 — area S = π·R2.
                The order number of one element and its value (as a real number) are given.
                Output values of other elements in the same order. Use 3.14 for a value of π.
                """);

        System.out.print("Enter The element number (1-radius, 2- diameter,3-length,4-area)");
        int elementNumber = scanner.nextInt();
        System.out.print("Enter the value : ");
        double value = scanner.nextDouble();
        double[] values = findTheValues(elementNumber, value);
        System.out.printf("The given element is %d value is %s", elementNumber, value);
        System.out.println("The radius is " + values[0]);
        System.out.println("the diameter is " + values[1]);
        System.out.println("the Length is " + values[2]);
        System.out.println("the area is " + values[3]);
    }

    public static double[] findTheValues(int elementNumber, double value) {
        double[] elements = new double[4];
        switch (elementNumber) {
            case 1:
                elements[0] = value;
                elements[1] = 2 * value;
                elements[2] = 2 * value * 3.14;
                elements[3] = 2 * value * value * 3.14;
                break;
            case 2:
                elements[0] = value / 2;
                elements[1] = value;
                elements[2] = value * 3.14;
                elements[3] = ((value * value) / 2) * 3.14;
                break;
            case 3:
                elements[0] = value / (2 * 3.14);
                elements[1] = value / 3.14;
                elements[2] = value;
                elements[3] = (value * value) / (4 * 3.14);
                break;
            case 4:
                elements[0] = Math.sqrt(value / (2 * 3.14));
                elements[1] = 2 * elements[0];
                elements[2] = 2 * elements[0] * 3.14;
                elements[3] = value;
                break;
            default:
                System.out.println("Invalid element number");
        }
        return elements;

    }


}
