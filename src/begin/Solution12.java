package begin;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Purpose of this solutions is to find some behaviours of the triangle");
        System.out.print("For that we just need two legs(sides a and b) of it let's start with A side = ");
        double aLeg = scanner.nextDouble();
        System.out.print("Now b side second leg B = ");
        double bLeg = scanner.nextDouble();
        // additional variable so math class won't call 3 times in the same line
        double sumOfLegsPow2 = Math.pow(aLeg, 2) + Math.pow(bLeg, 2);
        double cHypotenuse = Math.sqrt(sumOfLegsPow2);
        double perimeter = cHypotenuse + aLeg + bLeg;
        System.out.printf("With give given legs A = %s,B = %s, hypotenuse C = %s and perimeter P = %s", aLeg, bLeg, cHypotenuse, perimeter);

    }
}
