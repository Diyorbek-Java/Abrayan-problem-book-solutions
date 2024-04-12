package whileSolutions;


import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given an integer N (> 0), find the amount and the sum of its digits.
                 Use the operators of integer division and taking the remainder after integer division.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int sum = 0;

        // Output digits starting from the rightmost digit
        while (n > 0) {
            int digit = n % 10; // Get the rightmost digit
            sum = sum + digit;
            n /= 10; // Remove the rightmost digit
        }
        System.out.printf("Sum digits of this N = %d number is: %d", n, sum);
        scanner.close();
    }
}
