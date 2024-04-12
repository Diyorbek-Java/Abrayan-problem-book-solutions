package whileSolutions;


import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given an integer N (> 0), output all digits of the number N starting from the right digit (a ones digit).
                 Use the operators of integer division and taking the remainder after integer division.
                 """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        System.out.println("Digits of " + n + " starting from the rightmost digit:");

        // Output digits starting from the rightmost digit
        while (n > 0) {
            int digit = n % 10; // Get the rightmost digit
            System.out.println(digit);
            n /= 10; // Remove the rightmost digit
        }
        scanner.close();
    }
}
