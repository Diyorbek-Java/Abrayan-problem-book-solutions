package begin;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Solution is for turning degrees in radian");
        System.out.print("Please enter degrees A:");
        double degrees = scanner.nextDouble();
        double radian = (degrees / 180) * 3.14;
        System.out.printf("Radian value of the given degrees = %s, is %s ", degrees, radian);
    }
}
