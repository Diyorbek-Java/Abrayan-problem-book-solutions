package integers;

import java.util.Scanner;


public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Wight in kilograms so The Application Turns it into Tons  : ");
        double kilogram = scanner.nextDouble();
        double tons = Double.parseDouble(String.format("%.2f", kilogram / 100));
        System.out.printf("The %s kilogram is equal to %s tons ", kilogram, tons);
    }
}
