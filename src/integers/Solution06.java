package integers;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A mus be lager than10 \n and the solution first takes left ten digit then one digit");
        System.out.print("So Please enter digit A :");
        int a = scanner.nextInt();
        int rightDigit = a % 10;
        int leftDigit = a / 10;
        System.out.printf("So the number is A = %d , Left digit of it (ten digit) = %d , Right Digit (one digit) = %d", a, leftDigit, rightDigit);
    }
}
