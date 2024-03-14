package integers;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A which must be three-digit,\n Solution reads the number from right to left");
        System.out.print("Please enter (tree digit) number : ");
        int a = scanner.nextInt();
        int rightDigit = a % 10;
        int middleDigit = (a / 10) % 10;
        int mostLeft = (a / 100) % 10;
        System.out.printf("So the number is A = %d ,\n Right Digit %d ,\n Middle Digit  %d,\n Left Digit %d", a, rightDigit, middleDigit, mostLeft);
    }
}
