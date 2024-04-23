package arraySolutions120to140;

import java.util.Scanner;

public class Solution134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane is given (points are determined by their coordinates x, y).
                Find two points of A with the maximal distance between them and output these points (in ascending order
                of their indices in the set A) and the value of the distance.
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
        int[] maxDistanceIndices = findMaxDistancePoints(xCoordinates, yCoordinates);

        System.out.println("Points with maximum distance between them:");
        System.out.println("Point 1: (" + xCoordinates[maxDistanceIndices[0]] + ", " + yCoordinates[maxDistanceIndices[0]] + ")");
        System.out.println("Point 2: (" + xCoordinates[maxDistanceIndices[1]] + ", " + yCoordinates[maxDistanceIndices[1]] + ")");
        System.out.println("Maximum distance: " + distance(xCoordinates[maxDistanceIndices[0]], yCoordinates[maxDistanceIndices[0]], xCoordinates[maxDistanceIndices[1]], yCoordinates[maxDistanceIndices[1]]));
    }

    public static int[] findMaxDistancePoints(int[] xA, int[] yA) {
        int[] maxDistanceIndices = {0, 1};
        double maxDistance = distance(xA[0], yA[0], xA[1], yA[1]);

        for (int i = 0; i < xA.length; i++) {
            for (int j = i + 1; j < xA.length; j++) {
                double dist = distance(xA[i], yA[i], xA[j], yA[j]);
                if (dist > maxDistance) {
                    maxDistance = dist;
                    maxDistanceIndices[0] = i;
                    maxDistanceIndices[1] = j;
                }
            }
        }

        return maxDistanceIndices;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
