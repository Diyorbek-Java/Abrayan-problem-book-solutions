package begin;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution finds the finale result of the y = 3x^6 − 6x^2 − 7 this formula with given x");
        System.out.print("Please enter value of the X: ");
        double x = scanner.nextDouble();
        // Formula y = 3x^6 − 6x^2 − 7.
        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
        System.out.printf("So the answer is fot given X = %s, Y = %s", x, y);
    }
}
