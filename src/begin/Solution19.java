package begin;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("So the Solution is to find behaviour of rectangle with 4 pint on axis");
        System.out.print("Enter x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y2 = ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2 = ");
        double y2 = scanner.nextDouble();
        //Sides of the rectangle are parallel to coordinate axes.
        //According to this clue we assign this value
        double aSide = Math.abs(x1-x2);
        double bSide = Math.abs(y1-y2);
        double perimeter= 2*(aSide*bSide);
        double area = aSide*bSide;
        System.out.printf("So the rectangle consist of those pints (%s,%s) and (%s,%s) \n",x1,y1,x2,y2);
        System.out.printf("has a Perimeter P = %s,Area S = %s",perimeter,area);
    }
}
