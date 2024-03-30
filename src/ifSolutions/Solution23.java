package ifSolutions;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given integer coordinates of three vertices of a rectangle whose sides are parallel to coordinate axes,
                find the coordinates of the fourth vertex of the rectangle.
                """);
        System.out.println("Enter the coordinates of three vertices of the rectangle:");
        System.out.print("Vertex 1 (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Vertex 2 (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Vertex 3 (x3 y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4 = 0;
        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }
        int y4 = 0;
        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }
        System.out.printf("The coordinates of the fourth vertex are: (%d,%d)", x4, y4);
    }


}
