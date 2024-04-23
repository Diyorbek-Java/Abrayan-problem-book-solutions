package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane and a point B are given (all points are determined by
                their coordinates x, y). Find the point of A that is the nearest to the point B. The distance R
                between two points with the coordinates (x1, y1) and (x2, y2) may be found by formula:
                                
                R = ((x2 − x1)2 + (y2 − y1)2)1/2.
                """);
        System.out.print("Enter the number of points in set A: ");
        int n = scanner.nextInt();
        int[] xCoordinates = new int[n];
        int[] yCoordinates = new int[n];

        System.out.println("Enter the coordinates of points in set A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            xCoordinates[i] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            yCoordinates[i] = scanner.nextInt();
        }

        System.out.println("Enter the coordinates of point B:");
        System.out.print("Enter x-coordinate of point B: ");
        int xB = scanner.nextInt();
        System.out.print("Enter y-coordinate of point B: ");
        int yB = scanner.nextInt();

        int nearest = findNearestPoint(xCoordinates, yCoordinates, xB, yB);

        System.out.printf("The nearest point in set for B (%d,%d) is A(%d,%d)", xB, yB, xCoordinates[nearest], yCoordinates[nearest]);

    }

    public static int findNearestPoint(int[] xA, int[] yA, int xB, int yB) {
        double minDistance = Double.MAX_VALUE;
        int nearestPointIndex = -1;

        for (int i = 0; i < xA.length; i++) {
            double distance = Math.sqrt(Math.pow(xB - xA[i], 2) + Math.pow(yB - yA[i], 2));
            if (distance < minDistance) {
                minDistance = distance;
                nearestPointIndex = i;
            }
        }

        return nearestPointIndex;
    }

}
