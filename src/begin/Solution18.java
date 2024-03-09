package begin;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution finding distance in 3 points A, B, C in axis. Consider that C layer between A and B");
        System.out.print("Enter point A: ");
        double aPoint = scanner.nextDouble();
        System.out.print("Enter point B: ");
        double bPoint = scanner.nextDouble();
        System.out.print("Enter point C: ");
        double cPoint = scanner.nextDouble();
        double lengthAC = Math.abs(aPoint - bPoint);
        double lengthBC = Math.abs(bPoint - cPoint);
        double project = lengthBC * lengthAC;
        System.out.printf("The distance between A=%s and  C=%s points is Lac = %s", aPoint, cPoint, lengthAC);
        System.out.printf("The distance between B=%s and  C=%s points is Lbc = %s", bPoint, cPoint, lengthBC);
        System.out.println("the Project of the lengths is " + project);
    }
}
