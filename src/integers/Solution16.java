package integers;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution user gives positive number which must be three-digit,\n Solution changes positions tens digit and ones digit ");
        System.out.print("Please enter number :");
        int digit = scanner.nextInt();
        int result = (digit / 100) * 100 + (digit % 10) * 10 + ((digit / 10) % 10);
        System.out.printf("So the number is A = %d , This %d digit created by moving digit tens to ones", digit, result);
    }
}
