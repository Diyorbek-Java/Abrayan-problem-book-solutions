package ifSolutions;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given coordinates of a point that does not lie on the coordinate axes,
                find the number of a coordinate quarter containing the point.""");
        System.out.println("Enter the x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.printf("Point is (%d,%d) so it located in 1 quarter", x, y);
        } else if (x < 0 && y > 0) {
            System.out.printf("Point is (%d,%d) so it located in 2 quarter", x, y);
        } else if (x < 0 && y < 0) {
            System.out.printf("Point is (%d,%d) so it located in 3 quarter", x, y);
        } else {
            System.out.printf("Point is (%d,%d) so it located in 4 quarter", x, y);
        }

    }

}
