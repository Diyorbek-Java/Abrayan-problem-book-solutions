package booleans;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for (x,y) is inside rectangle according to other 4 given coordinates");
        System.out.println("enter the coordinate of x : ");
        double x = scanner.nextDouble();
        System.out.println("enter the coordinate of y : ");
        double y = scanner.nextDouble();
        System.out.println("enter the coordinate of x1 : ");
        double x1 = scanner.nextDouble();
        System.out.println("enter the coordinate of y1 : ");
        double y1 = scanner.nextDouble();
        System.out.println("enter the coordinate of x2 : ");
        double x2 = scanner.nextDouble();
        System.out.println("enter the coordinate of y2 : ");
        double y2 = scanner.nextDouble();
        if (isInsideRectangle(x, y, x1, y1, x2, y2)) {
            System.out.printf("The point (%s,%s) is inside rectangle", x, y);
        } else {
            System.out.printf("The point (%s,%s) is not inside rectangle", x, y);
        }
    }

    public static boolean isInsideRectangle(double x, double y, double x1, double y1, double x2, double y2) {
        boolean condition_x = x1 <= x && x <= x2;
        boolean condition_y = y1 <= y && y <= y2;
        return condition_x && condition_y;
    }


}
