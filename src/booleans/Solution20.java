package booleans;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs three-digit input number and it checks whether The All digits are different or not in number ");
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
            System.out.println("All digits of the number are different.");
        } else {
            System.out.println("The number has at least one repeated digit.");
        }
    }


}
