package begin;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the requirements are two digits and they applied for Ax+B=0  formula");
        System.out.print("Enter Number A which can not be 0: ");
        double a = scanner.nextDouble();
        System.out.print("Enter number B : ");
        double b = scanner.nextDouble();
        double applyingFormula = (-b) / a;
        String result = String.format("%.2f", applyingFormula);
        System.out.printf("The formula was like %s x + %s = 0  and as result x = %s", a, b, result);


    }

}
