package ifSolutions;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Three points A, B, C on the real axis are given." +
                "\nDetermine whether B or C is closer to A. Output the nearest point and its distance from A.");
        System.out.print("Enter the coordinate of point A: ");
        double pointA = scanner.nextDouble();
        System.out.print("Enter the coordinate of point B: ");
        double pointB = scanner.nextDouble();
        System.out.print("Enter the coordinate of point C: ");
        double pointC = scanner.nextDouble();

        double distanceAB = Math.abs(pointA - pointB);
        double distanceAC = Math.abs(pointA - pointC);

        if (distanceAB < distanceAC) {
            System.out.println("Point B is closer to point A.");
            System.out.println("Distance between A and B: " + distanceAB);
        } else if (distanceAC < distanceAB) {
            System.out.println("Point C is closer to point A.");
            System.out.println("Distance between A and C: " + distanceAC);
        } else {
            System.out.println("Both points B and C are equidistant from point A.");
            System.out.println("Distance between A and B: " + distanceAB);
            System.out.println("Distance between A and C: " + distanceAC);
        }
    }

}
