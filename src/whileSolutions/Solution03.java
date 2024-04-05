package whileSolutions;


import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers N and K are given.
                Using addition and subtraction only, find a quotient of the integer
                division N on K and also a remainder after this division.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        System.out.println("Enter number K: ");
        int k = scanner.nextInt();
        int quotient = 0;
        int remainder = n;

        while (remainder >= k) {
            remainder -= k;
            quotient++;
        }
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}
