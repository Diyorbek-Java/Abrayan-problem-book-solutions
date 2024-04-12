package whileSolutions;


import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. Determine whether its decimal representation contains odd digits or not, and output True or False respectively.
                Use the operators of integer division and taking the remainder after integer division.
                """);
        System.out.print("Enter number N(>0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        boolean containOddDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                containOddDigit = true;
                break;
            }
            n /= 10;
        }
        if (containOddDigit) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }
}
