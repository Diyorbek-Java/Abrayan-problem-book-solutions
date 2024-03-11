package begin;

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the requirements are tree digits and they applied for Ax^2+Bx+C=0  formula");
        System.out.print("Let's start with A: ");
        double aValue= scanner.nextDouble();
        System.out.print("Enter B now : ");
        double bValue = scanner.nextDouble();
        System.out.print("Lastly C : ");
        double cValue = scanner.nextDouble();
        double dValue = Math.pow(bValue, 2) - 4 * aValue * cValue;
        if (dValue < 0) {
            System.out.printf("Sorry the formula %s x^2 + %s x +%s =0 has no solutions", aValue, bValue, cValue);
            return;
        }
        double x1 = ((-bValue) + Math.sqrt(dValue)) / (2 * aValue);
        double x2 = ((-bValue) - Math.sqrt(dValue)) / (2 * aValue);
        String result1 = String.format("%.2f", x1);
        String result2 = String.format("%.2f", x2);
        System.out.printf("the formula %s x^2 + %s x +%s =0 have solutions x1 = %s , x2 = %s", aValue, bValue, cValue, result1, result2);


    }

}
