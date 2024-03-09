package begin;

import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the A side of the Parallelepiped: ");
        double aSide = scanner.nextDouble();
        System.out.print("Now Enter the B side of the Parallelepiped: ");
        double bSide = scanner.nextDouble();
        System.out.print("Enter last C Side od the Parallelepiped: ");
        double cSide = scanner.nextDouble();
        double volume = aSide * bSide * cSide;
        double surface = 2 * (aSide * bSide + aSide * cSide + bSide * cSide);
        System.out.printf("With in the given Parallelepiped \n Sides A = %s ,B = %s , C = %s", aSide, bSide, cSide);
        System.out.printf("\n Volume and surface are %s and %s respectively", volume, surface);

    }

}
