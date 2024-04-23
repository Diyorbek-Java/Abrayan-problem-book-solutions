package arraySolutions120to140;

import java.util.Arrays;
import java.util.Scanner;

public class Solution139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A set A of N points with integer-valued coordinates x, y is given. The order in the plane is defined as follows:
                                (x1, y1) < (x2, y2),    if either x1 < x2 or x1 = x2 and y1 < y2.
                Using this order definition, rearrange points of A in ascending order.
                """);

        System.out.print("Enter the number of points in set A: ");
        int n = scanner.nextInt();

        int[][] points = new int[n][2];

        System.out.println("Enter the coordinates of points in set A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            points[i][0] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            points[i][1] = scanner.nextInt();
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] < p2[0] || (p1[0] == p2[0] && p1[1] < p2[1])) {
                return -1;
            } else if (p1[0] == p2[0] && p1[1] == p2[1]) {
                return 0;
            } else {
                return 1;
            }
        });

        System.out.println("Points of set A rearranged in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.println("(" + points[i][0] + ", " + points[i][1] + ")");
        }

    }
}
