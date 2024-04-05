package whileSolutions;


import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0), compute the double factorial of N:
                N!! = N·(N−2)·(N−4)·…,
                where the last factor equals 2 if N is an even number, and 1 otherwise.
                To avoid the integer overflow,
                compute the double factorial using a real variable and output the result as a real number.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int factor = n;
        while (factor >= 1) {
            factorial *= factor;
            factor -= 2;
        }
        System.out.printf("Double factorial of %d is: %d ", n, factorial);
        scanner.close();
    }
}
