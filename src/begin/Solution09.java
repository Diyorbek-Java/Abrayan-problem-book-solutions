package begin;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1  A = ");
        double a = scanner.nextDouble();
        System.out.print("Enter number2 B = ");
        double b = scanner.nextDouble();
        double geometricalMean = Math.sqrt((a * b));
        System.out.printf("Geometrical mean of the numbers (%s,%s) is %s", a, b, geometricalMean);
    }
}
