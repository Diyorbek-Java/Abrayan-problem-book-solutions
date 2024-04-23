package arraySolutions120to140;

import java.util.Scanner;

public class Solution137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane is given (N > 2, points are determined by their coordinates x, y).
                Find the maximal perimeter of a triangle with vertices belonging to A.
                Output this perimeter and the corresponding vertices (in ascending order of their indices in the set A).
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

        double[] maxPerimeterInfo = findMaxTrianglePerimeter(xA, yA);

        System.out.println("Maximal perimeter of a triangle with vertices belonging to set A: " + maxPerimeterInfo[0]);
        System.out.println("Vertices (in ascending order of their indices in set A):");
        System.out.println("Point 1: (" + xA[(int) maxPerimeterInfo[1]] + ", " + yA[(int) maxPerimeterInfo[1]] + ")");
        System.out.println("Point 2: (" + xA[(int) maxPerimeterInfo[2]] + ", " + yA[(int) maxPerimeterInfo[2]] + ")");
        System.out.println("Point 3: (" + xA[(int) maxPerimeterInfo[3]] + ", " + yA[(int) maxPerimeterInfo[3]] + ")");

    }
    public static double[] findMaxTrianglePerimeter(int[] xA, int[] yA) {
        double maxPerimeter = 0;
        double[] maxPerimeterInfo = new double[4];

        for (int i = 0; i < xA.length; i++) {
            for (int j = i + 1; j < xA.length; j++) {
                for (int k = j + 1; k < xA.length; k++) {
                    double perimeter = calculatePerimeter(xA[i], yA[i], xA[j], yA[j], xA[k], yA[k]);
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        maxPerimeterInfo[0] = maxPerimeter;
                        maxPerimeterInfo[1] = i;
                        maxPerimeterInfo[2] = j;
                        maxPerimeterInfo[3] = k;
                    }
                }
            }
        }

        return maxPerimeterInfo;
    }

    public static double calculatePerimeter(int x1, int y1, int x2, int y2, int x3, int y3) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        return side1 + side2 + side3;
    }
}
