package begin;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the requirements are 6 digits and they applied for Ax^2+Bx+C=0  formula");
        System.out.print("Let's start with A1 value: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter B1 value: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter C1 value: ");
        double c1 = scanner.nextDouble();
        System.out.print("Let's move second A2 value: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter B2 value: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter C2 value: ");
        double c2 = scanner.nextDouble();
        double d = a1 * b2 - a2 * b1;
        double dRes = Double.parseDouble(String.format("%.2f", d));
        //x = (C1·B2 − C2·B1)/D
        double x = (((c1 * b2)) - (c2 * b1)) / dRes;
        String xResult = String.format("%.2f", x);
        //y = (A1·C2 − A2·C1)/D
        double y = ((a1 * c2) - (a2 * c1)) / dRes;
        String yResult = String.format("%.2f", y);
        System.out.printf("%s x + %s y = %s  for that liner equations solutions are \n", a1, b1, c1);
        System.out.printf("%s x + %s y = %s   x = %s , y= %s   ", a2, b2, c2, xResult, yResult);


    }

}
