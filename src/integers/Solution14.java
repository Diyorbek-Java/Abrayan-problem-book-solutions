package integers;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution user gives positive number which must be three-digit,\nThis moves right digit To left side  ");
        System.out.print("Please enter number : ");
        int number = scanner.nextInt();
        int result = (number % 10) * 100 + number / 10;
        System.out.printf("So the number is A = %d , This %d digit created with moving right digit to left ", number, result);
    }
}
