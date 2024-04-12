package whileSolutions;


import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers A and B are given. Find their greatest common divisor (GCD) using the Euclidean algorithm:
                GCD(A, B) = GCD(B, A mod B),    if B ≠ 0;        GCD(A, 0) = A,
                where "mod" denotes the operator of taking the remainder after integer division.
                """);
        System.out.print("Enter the first positive integer (A): ");
        int A = scanner.nextInt();

        System.out.print("Enter the second positive integer (B): ");
        int B = scanner.nextInt();

        // Validate inputs
        if (A <= 0 || B <= 0) {
            System.out.println("Both integers should be positive.");
            return;
        }

        // Find the GCD using the Euclidean algorithm
        int gcd = findGCD(A, B);

        System.out.println("The greatest common divisor (GCD) of " + A + " and " + B + " is: " + gcd);
        scanner.close();
    }

    // Function to find the GCD using the Euclidean algorithm
    public static int findGCD(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }
}
