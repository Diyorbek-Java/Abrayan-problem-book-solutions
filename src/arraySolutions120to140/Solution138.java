package arraySolutions120to140;

import java.util.Scanner;

public class Solution138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points in the coordinate plane is given (N > 2, points are determined by their coordinates x, y).
                Find the minimal perimeter of a triangle with vertices belonging to A.
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

        double[] minPerimeterInfo = findMinTrianglePerimeter(xA, yA);

        System.out.println("Maximal perimeter of a triangle with vertices belonging to set A: " + minPerimeterInfo[0]);
        System.out.println("Vertices (in ascending order of their indices in set A):");
        System.out.println("Point 1: (" + xA[(int) minPerimeterInfo[1]] + ", " + yA[(int) minPerimeterInfo[1]] + ")");
        System.out.println("Point 2: (" + xA[(int) minPerimeterInfo[2]] + ", " + yA[(int) minPerimeterInfo[2]] + ")");
        System.out.println("Point 3: (" + xA[(int) minPerimeterInfo[3]] + ", " + yA[(int) minPerimeterInfo[3]] + ")");

    }
    public static double[] findMinTrianglePerimeter(int[] xA, int[] yA) {
        double minPerimeter = Double.MAX_VALUE;
        double[] minPerimeterInfo = new double[4];

        // Iterate over all combinations of three points from set A to find the minimal perimeter
        for (int i = 0; i < xA.length; i++) {
            for (int j = i + 1; j < xA.length; j++) {
                for (int k = j + 1; k < xA.length; k++) {
                    double perimeter = calculatePerimeter(xA[i], yA[i], xA[j], yA[j], xA[k], yA[k]);
                    if (perimeter < minPerimeter) {
                        minPerimeter = perimeter;
                        minPerimeterInfo[0] = minPerimeter;
                        minPerimeterInfo[1] = i;
                        minPerimeterInfo[2] = j;
                        minPerimeterInfo[3] = k;
                    }
                }
            }
        }

        return minPerimeterInfo;
    }

    public static double calculatePerimeter(int x1, int y1, int x2, int y2, int x3, int y3) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        return side1 + side2 + side3;
    }

}
