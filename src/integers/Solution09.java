package integers;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A must be three-digit Answer will be finding the first digit ");
        System.out.print("Please enter number : ");
        int a = scanner.nextInt();
        int mostLeftDigit = a % 100;
        System.out.printf("So the number is  %d , We have Most Left Digit is = %d", a, mostLeftDigit);
    }
}
