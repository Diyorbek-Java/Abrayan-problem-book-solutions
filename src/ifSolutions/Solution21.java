package ifSolutions;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integer coordinates of a point in the coordinate plane
                are given. If the point coincides with the origin of coordinates\s
                then output 0, otherwise if the point lies on the x-axis or y-axis then output 1 or 2 respectively. If the point does not lie on the coordinate axes then output 3.""");
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.printf("Point is (%d,%d) so output is 0", x, y);
        } else if (x == 0 || y == 0) {
            if (x == 0) {
                System.out.printf("Point is (%d,%d) so output is 1", x, y);
            } else {
                System.out.printf("Point is (%d,%d) so output is 2", x, y);
            }
        } else {
            System.out.printf("Point is (%d,%d) so output is 3", x, y);
        }

    }

}
