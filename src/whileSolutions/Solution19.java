package whileSolutions;


import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. Output an integer obtained from the given one by reading it from right to left.
                Use the operators of integer division and taking the remainder after integer division.
                """);
        System.out.print("Enter number N(>0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int reversedNumber = 0;

        // Reverse the digits of N
        while (n > 0) {
            int digit = n % 10; // Get the rightmost digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the rightmost digit
        }
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
