package ifSolutions;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution needs three numbers and it sums two largest values");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int num3 = scanner.nextInt();

        int max2 = 0;
        int maximal = 0;

        if (num1 > num2 && num1 > num3) {
            maximal = num1;
            if (num2 > num3) {
                max2 = num2;
            } else {
                max2 = num3;
            }
        } else if (num2 > num1 && num2 > num3) {
            maximal = num2;
            if (num1 > num3) {
                max2 = num1;
            } else {
                max2 = num3;
            }
        } else if (num3 > num1 && num3 > num2) {
            maximal = num3;
            if (num2 > num1) {
                max2 = num2;
            } else {
                max2 = num1;
            }
        }
        System.out.printf("So the values are %d,%d,%d and the sum of two largest values is %d", num1, num2, num3, maximal + max2);
    }

}
