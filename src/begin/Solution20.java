package begin;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("this solution is for finding distance of a pints and adds them up");
        System.out.print("Enter the pint x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the pint y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the pint x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the pint y2 = ");
        double y2 = scanner.nextDouble();
        // According to Formula given it first subtract the numbers and pow them up to 2
        // and adds them then finds square rute of the value, it is done like that
        double lengthOfx = Math.pow(x1 - x2, 2);
        double lengthOfy = Math.pow(y1 - y2, 2);
        double length = Math.sqrt(lengthOfx - lengthOfy);
        System.out.printf("So the distance between points (%s,%s) ad (%s,%s) is %s ", x1, y1, x2, y2, length);
    }
}
