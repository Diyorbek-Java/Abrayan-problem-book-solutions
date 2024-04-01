package CaseSolutions;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Elements of an equilateral triangle are numbered as: 1 — side a, 2 — radius R1 of inscribed circle (R1 = a·(3)1/2/6),
                3 — radius R2 of circumscribed circle (R2 = 2·R1), 4 — area S = a2·(3)1/2/4.
                The order number of one element and its value (as a real number) are given.
                Output values of other elements in the same order.
                """);
        System.out.print("Enter the order number of the element: ");
        int orderNumber = scanner.nextInt();

        System.out.print("Enter the value of the element: ");
        double elementValue = scanner.nextDouble();

        switch (orderNumber) {
            case 1:
                double c = elementValue * Math.sqrt(2);
                double h = c / 2;
                double S = c * h / 2;
                System.out.println("Hypotenuse c = a·(2)^1/2: " + c);
                System.out.println("Altitude h drawn onto hypotenuse (h = c/2): " + h);
                System.out.println("Area S = c·h/2: " + S);
                break;
            case 2:
                double a = elementValue / Math.sqrt(2);
                h = elementValue / 2;
                S = elementValue * h / 2;
                System.out.println("Leg a: " + a);
                System.out.println("Altitude h drawn onto hypotenuse (h = c/2): " + h);
                System.out.println("Area S = c·h/2: " + S);
                break;
            case 3:
                c = elementValue * 2;
                a = c / Math.sqrt(2);
                S = c * elementValue / 2;
                System.out.println("Leg a: " + a);
                System.out.println("Hypotenuse c = a·(2)^1/2: " + c);
                System.out.println("Area S = c·h/2: " + S);
                break;
            case 4:
                c = Math.sqrt(elementValue * 8);
                a = c / Math.sqrt(2);
                h = c / 2;
                System.out.println("Leg a: " + a);
                System.out.println("Hypotenuse c = a·(2)^1/2: " + c);
                System.out.println("Altitude h drawn onto hypotenuse (h = c/2): " + h);
                break;
            default:
                System.out.println("Invalid order number.");
        }
    }

}
