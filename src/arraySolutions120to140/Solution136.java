package arraySolutions120to140;

import java.util.Scanner;

public class Solution136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane is given (N > 2, points are determined by their coordinates x, y).
                Find the point of A such that the sum of distances between this point and other points of A is minimal and
                output this point and the corresponding sum.
                """);

        System.out.print("Enter the number of points in set A: ");
        int n = scanner.nextInt();

        int[] xA = new int[n];
        int[] yA = new int[n];

        System.out.println("Enter the coordinates of points in set A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            xA[i] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            yA[i] = scanner.nextInt();
        }

        int[] minSumDistancePoint = findMinSumDistancePoint(xA, yA);

        System.out.println("Point in set A with minimal sum of distances to other points: (" + xA[minSumDistancePoint[0]] + ", " + yA[minSumDistancePoint[0]] + ")");
        System.out.println("Minimal sum of distances: " + minSumDistancePoint[1]);

    }

    public static int[] findMinDistancePoints(int[] xA, int[] yA, int[] xB, int[] yB) {
        int[] minDistanceIndices = {0, 0};
        double minDistance = distance(xA[0], yA[0], xB[0], yB[0]);

        // Iterate over all pairs of points from sets A and B and update minDistance if a smaller distance is found
        for (int i = 0; i < xA.length; i++) {
            for (int j = 0; j < xB.length; j++) {
                double dist = distance(xA[i], yA[i], xB[j], yB[j]);
                if (dist < minDistance) {
                    minDistance = dist;
                    minDistanceIndices[0] = i;
                    minDistanceIndices[1] = j;
                }
            }
        }

        return minDistanceIndices;
    }

    public static int[] findMinSumDistancePoint(int[] xA, int[] yA) {
        int[] minSumDistancePoint = {0, Integer.MAX_VALUE}; // Initialize point and sum of distances
        int sumDistance;

        // Iterate over each point in set A and compute the sum of distances from that point to all other points
        for (int i = 0; i < xA.length; i++) {
            sumDistance = 0;
            for (int j = 0; j < xA.length; j++) {
                if (i != j) {
                    sumDistance += (int) distance(xA[i], yA[i], xA[j], yA[j]);
                }
            }
            // Update minSumDistancePoint if the sum of distances is smaller
            if (sumDistance < minSumDistancePoint[1]) {
                minSumDistancePoint[0] = i;
                minSumDistancePoint[1] = sumDistance;
            }
        }

        return minSumDistancePoint;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
