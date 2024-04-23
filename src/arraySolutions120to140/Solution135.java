package arraySolutions120to140;

import java.util.Scanner;

public class Solution135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two sets A and B of N1 and N2 points respectively are given (points are determined by their coordinates x, y).
                Find the point of A and the point of B with the minimal distance between them. Output the value of the distance
                and then the point of A and the point of B.
                """);

        System.out.print("Enter the number of points in set A: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the number of points in set B: ");
        int n2 = scanner.nextInt();

        int[] xA = new int[n1];
        int[] yA = new int[n1];
        int[] xB = new int[n2];
        int[] yB = new int[n2];

        System.out.println("Enter the coordinates of points in set A:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            xA[i] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            yA[i] = scanner.nextInt();
        }

        System.out.println("Enter the coordinates of points in set B:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            xB[i] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            yB[i] = scanner.nextInt();
        }
        scanner.close();
        int[] minDistanceIndices = findMinDistancePoints(xA, yA, xB, yB);

        System.out.println("Minimal distance between sets A and B: " + distance(xA[minDistanceIndices[0]], yA[minDistanceIndices[0]], xB[minDistanceIndices[1]], yB[minDistanceIndices[1]]));
        System.out.println("Point in set A: (" + xA[minDistanceIndices[0]] + ", " + yA[minDistanceIndices[0]] + ")");
        System.out.println("Point in set B: (" + xB[minDistanceIndices[1]] + ", " + yB[minDistanceIndices[1]] + ")");

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

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
