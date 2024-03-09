package begin;


import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This  Solution for finding the distance between tree points and sum them up");
        System.out.print("So, Enter the Pint A = ");
        double aPoint = scanner.nextDouble();
        System.out.print("Enter the Pint B = ");
        double bPoint = scanner.nextDouble();
        System.out.print("Enter the Pint C = ");
        double cPoint = scanner.nextDouble();
        double lengthAC = Math.abs(aPoint - cPoint);
        double lengthBC = Math.abs(bPoint - cPoint);
        double sum = lengthBC + lengthAC;
        System.out.printf("The length of the A = %s and C = %s points is LengthAC = %s\n", aPoint, cPoint, lengthAC);
        System.out.printf("The length of the B =%s and C = %s points is lengthBC= %s\n", bPoint, cPoint, lengthBC);
        System.out.printf("The sum of lengthBC and lengthAC is %s", sum);

    }
}
