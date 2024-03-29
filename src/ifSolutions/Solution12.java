package ifSolutions;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution needs three numbers and outputs the minimal values of it");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int num3 = scanner.nextInt();

        int minimal = Math.min(Math.min(num1, num2), num3);
        System.out.printf("So the values are %d,%d,%d an minimal one is %d", num1, num2, num3, minimal);
    }

}
