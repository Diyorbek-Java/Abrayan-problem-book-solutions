package begin;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so the Solution mend to work for finding Difference of the surfaces of concentric circles");
        System.out.print("So lets start with R1 radius of the first Circle this should be bigger than next one: ");
        double radius1 = scanner.nextDouble();
        System.out.print("Radius of the second Circle = ");
        double radius2 = scanner.nextDouble();
        double surface1 = Math.round(3.14 * Math.pow(radius1, 2));
        double surface2 = Math.round(3.14 * Math.pow(radius2, 2));
        double surface3 = surface1 - surface2;
        System.out.printf("So surface of the circle with radius = %s is S = %s ", radius1, surface1);
        System.out.printf("\nSurface of the circle with radius = %s  is S = %s", radius2, surface2);
        System.out.printf("\nThe ring between those circles are S = %s", surface3);
    }
}
