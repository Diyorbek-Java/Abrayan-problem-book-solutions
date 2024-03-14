package integers;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution user gives positive number which must be three-digit,\n Solution creates new digit left to right");
        System.out.print("Please enter number : ");
        int number = scanner.nextInt();
        int result = (number % 100) * 10 + (number / 100);
        System.out.printf("So the number is A = %d , This %d digit created with moving left digit to right ", number, result);
    }
}
