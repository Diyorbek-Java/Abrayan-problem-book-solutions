package booleans;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs four-digit input number and it checks whether The All digits are in ascending order or not");
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if (number / 1000 > 9) {
            System.out.print("The number is contains more than 4 digits");
            return;
        }
        int digit1 = number / 1000;
        int digit2 = number / 100;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;


        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println("The number is read equally both from left to right and from right to left");
        } else {
            System.out.println("The number is not read equally from left to right and from right to left");
        }
    }


}
