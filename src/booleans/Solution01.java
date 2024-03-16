package booleans;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the Solution works for checking given number either negative or not");
        System.out.print("Please Enter number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.printf("The number given %d is positive", number);
        } else if (number < 0) {
            System.out.printf("The number given %d is negative", number);
        } else {
            System.out.printf("The number given %d is zero", number);
        }
    }

}
