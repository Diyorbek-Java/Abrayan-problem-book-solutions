package ifSolutions;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Three integers are given. One of them differs from two other equal " +
                "\nintegers. Output the order number of the integer that differs from the others. ");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int num3 = scanner.nextInt();
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("Non of them equal at least coule of them should be the same");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All of them the same valued numbers");
        } else if (num1 == num2) {
            System.out.printf("The integer differing from others is  %d", num3);
        } else if (num1 == num3) {
            System.out.printf("The integer differing from others is  %d", num2);
        } else {
            System.out.printf("The integer differing from others is  %d", num1);
        }
    }

}
