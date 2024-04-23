package arraySolutions120to140;

import java.util.Scanner;

public class Solution133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
               A set A of N points in the coordinate plane is given (points are determined by their coordinates x, y).
               Find the point of A that lies in the first or the third coordinate quarter and is the nearest to the origin.
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

        int nearest = findNearestPointInFirstOrThirdQuarter(xCoordinates, yCoordinates);
        if (nearest != -1) {
            System.out.printf("The farthest point in the first or third coordinate quarter of set A from the origin is: A (%d,%d)", xCoordinates[nearest], yCoordinates[nearest]);
        } else {
            System.out.println("No point in the first or third coordinate quarter of set A. Outputting origin (0, 0).");
        }
    }


    public static int findNearestPointInFirstOrThirdQuarter(int[] xA, int[] yA) {
        double minDistance = Double.MAX_VALUE;
        int nearestPointIndex = -1;

        for (int i = 0; i < xA.length; i++) {
            if ((xA[i] >= 0 && yA[i] >= 0) || (xA[i] <= 0 && yA[i] <= 0)) { // Check if point lies in the first or third coordinate quarter
                double distance = Math.sqrt(Math.pow(xA[i], 2) + Math.pow(yA[i], 2));
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestPointIndex = i;
                }
            }
        }

        return nearestPointIndex;
    }

}
