package whileSolutions;


import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) is given. If it is a prime number, i. e.,
                it has not positive divisors except 1 and itself, then output True, otherwise output False.
                """);
        System.out.print("Enter number N(>0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        boolean isPrime = true;
        int divisor = 2;

        // Check for divisibility from 2 to square root of N
        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }

        System.out.println("Is " + n + " a prime number? " + isPrime);
        scanner.close();
    }
}
