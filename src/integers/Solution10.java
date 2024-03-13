package integers;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A must be three-digit Solution finds mid digit (ten-digit) ");
        System.out.print("Please enter digit : ");
        int a = scanner.nextInt();
        int midDigit = (a / 10) % 10;
        System.out.printf("So the number is  %d , Mid Digit (ten-digit) is = %d", a, midDigit);
    }
}
