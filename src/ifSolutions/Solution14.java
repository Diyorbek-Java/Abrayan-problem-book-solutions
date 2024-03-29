package ifSolutions;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution needs three numbers and it shows the difference between minimal and maximal number");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int num3 = scanner.nextInt();

        int minimal = 0;
        int maximal = 0;

        if (num1 > num2 && num1 > num3) {
            maximal = num1;
            if (num2 > num3) {
                minimal = num3;
            } else {
                minimal = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maximal = num2;
            if (num1 > num3) {
                minimal = num3;
            } else {
                minimal = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            maximal = num3;
            if (num2 > num1) {
                minimal = num1;
            } else {
                minimal = num2;
            }
        }
        System.out.printf("So the values are %d,%d,%d and the minimal value is %d , maximal value is %d", num1, num2, num3, minimal, maximal);
    }

}
