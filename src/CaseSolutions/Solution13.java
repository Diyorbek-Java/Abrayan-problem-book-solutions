package CaseSolutions;

import javax.swing.*;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Elements of a right isosceles triangle are numbered as: 1 — leg a, 2 — hypotenuse c = a·(2)1/2,
                3 — altitude h drawn onto hypotenuse (h = c/2), 4 — area S = c·h/2.
                The order number of one element and its value (as a real number) are given. Output values of other elements in the same order""");

        System.out.print("Enter The element number (1-leg, 2- hypotenuse,3-attitude,4-area)");
        int elementNumber = scanner.nextInt();
        System.out.print("Enter the value : ");
        double value = scanner.nextDouble();
        double[] values = findTheValues(elementNumber, value);
        System.out.printf("The given element is %d value is %s", elementNumber, value);
        System.out.println("The leg is " + values[0]);
        System.out.println("the hypotenuse is " + values[1]);
        System.out.println("the altitude h drawn onto hypotenuse is " + values[2]);
        System.out.println("the area is " + values[3]);
    }

    public static double[] findTheValues(int elementNumber, double value) {
        double[] elements = new double[4];
        switch (elementNumber) {
            case 1:
                elements[0] = value;
                elements[1] = value * Math.sqrt(2);
                elements[2] = value / 2;
                elements[3] = value * elements[2] / 2;
                break;
            case 2:
                elements[0] = value / Math.sqrt(2);
                elements[1] = value;
                elements[2] = elements[0] / 2;
                elements[3] = elements[0] * elements[2] / 2;
                break;
            case 3:
                elements[0] = value * 2;
                elements[1] = value * 2 * Math.sqrt(2);
                elements[2] = value;
                elements[3] = elements[1] * value;
                break;
            case 4:
                elements[1] = Math.sqrt(value * 8);
                elements[0] = elements[1] / Math.sqrt(2);
                elements[2] = elements[1] / 2;
                elements[3] = value;
                break;
            default:
                System.out.println("Invalid element number");
        }
        return elements;

    }


}
