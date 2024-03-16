package booleans;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution works for checking given number either odd or even");
        System.out.print("Please Enter number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.printf("The number given %d is even", number);
        } else {
            System.out.printf("The number given %d is odd", number);
        }
    }

}
