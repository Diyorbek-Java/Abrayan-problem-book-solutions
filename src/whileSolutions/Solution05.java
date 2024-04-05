package whileSolutions;


import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0) that equals 2 raised to some integer power: N = 2^K,
                find the exponent K of the power.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int degree = 0;
        while (n != 1) {
            degree++;
            n /= 2;
        }

        System.out.println("Number of degrees: " + degree);
        scanner.close();
    }
}
