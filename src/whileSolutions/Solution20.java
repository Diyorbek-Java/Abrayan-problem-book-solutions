package whileSolutions;


import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 An integer N (> 0) is given. Determine whether its decimal representation contains a digit "2" or not, and output True or False respectively.
                 Use the operators of integer division and taking the remainder after integer division.
                """);
        System.out.print("Enter number N(>0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        boolean containDigitTwo = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2) {
                containDigitTwo = true;
                break;
            }
            n /= 10;
        }
        if (containDigitTwo) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }
}
