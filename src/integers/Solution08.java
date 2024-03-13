package integers;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A must be two-digit  and answer will be exchanging the numbers");
        System.out.print("Please enter digit: ");
        int a = scanner.nextInt();
        int rightDigit = a % 10;
        int leftDigit = a / 10;
        int b = rightDigit * 10 + leftDigit;
        System.out.printf("So the number is %d , VY Exchanging its digits We have A = %d", a, b);
    }
}
