package integers;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution user gives positive number which must be three-digit,\nThis moves tens digit to hundreds digit ");
        System.out.print("Please enter number : ");
        int number = scanner.nextInt();
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = number / 100;
        int onesDigit = number % 10;
        int result = tensDigit * 100 + hundredsDigit * 10 + onesDigit;
        System.out.printf("So the number is A = %d , This %d digit created with moving tens digit to hundred and hundreds to tens ", number, result);
    }
}
