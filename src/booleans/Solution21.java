package booleans;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs three-digit input number and it checks whether The All digits are in ascending order or not");
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if (number / 100 > 9) {
            System.out.print("The number is contains more than 3 digits");
            return;
        }
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (digit1 < digit2 && digit2 < digit3) {
            System.out.println("All digits of the number is ascending order");
        } else {
            System.out.println("The digits of the number is not ascending order.");
        }
    }


}
