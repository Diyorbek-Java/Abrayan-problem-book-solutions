package arraySolutions120to140;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane is given (points are determined by their coordinates x, y).
                Find the point of A that lies in the second coordinate quarter and is the farthest from the origin.
                If the set A does not contain such points then output the origin (0, 0).
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
        scanner.close();

        int farthestPointIndex = findFarthestPointInSecondQuarter(xCoordinates, yCoordinates);
        if (farthestPointIndex != -1) {
            System.out.printf("The farthest point in the second coordinate quarter of set A from the origin is: A (%d,%d)",xCoordinates[farthestPointIndex], yCoordinates[farthestPointIndex]);
        } else {
            System.out.println("No point in the second coordinate quarter of set A. Outputting origin (0, 0).");
        }
    }


    public static int findFarthestPointInSecondQuarter(int[] xA, int[] yA) {
        double maxDistance = 0;
        int farthestPointIndex = -1;

        for (int i = 0; i < xA.length; i++) {
            if (xA[i] < 0 && yA[i] > 0) { // Check if point lies in the second coordinate quarter
                double distance = Math.sqrt(Math.pow(xA[i], 2) + Math.pow(yA[i], 2));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    farthestPointIndex = i;
                }
            }
        }

        return farthestPointIndex;
    }

}
