package begin;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So this is finding behaviour of the triangle  that lays on axis on (x1,y1), (x2,y2),(x3,y3)");
        System.out.print("Let's start getting coordinates x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2 = ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3 = ");
        double y3 = scanner.nextDouble();
        //((x2 − x1)^2 + (y2 − y1)^2)^1/2 applying this formula in code to find distance between two points
        double aSideLength = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double bSideLength = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double cSideLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double p = aSideLength + bSideLength + cSideLength / 2;
        double perimeter = aSideLength + bSideLength + cSideLength;
        //S = (p·(p − a)·(p − b)·(p − c))^1/2 this formula used to find the area
        double area = Math.sqrt(p * (p - aSideLength) * (p - bSideLength) * (p - cSideLength));
        System.out.printf("So the behaviours of the triangle which has edge located at (%s,%s),(%s,%s),(%s,%s)\n", x1, y1, x2, y2, x3, y3);
        System.out.printf("are perimeter = %s and area = %s", perimeter, area);

    }
}
