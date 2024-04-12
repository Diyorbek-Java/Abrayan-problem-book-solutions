package whileSolutions;


import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) is given. An integer-valued sequence of the Fibonacci numbers FK is defined as:
                F1 = 1,        F2 = 1,        FK = FK−2 + FK−1,    K = 3, 4, … .
                Determine whether N is a Fibonacci number or not, and output True or False respectively.
                """);
        System.out.print("Enter the first positive integer N: ");
        int n = scanner.nextInt();
        boolean isFibonacci = isFibonacci(n);

        // Output the result
        System.out.println("Is " + n + " a Fibonacci number? " + isFibonacci);

        scanner.close();
    }

    // Function to check if a number is a Fibonacci number
    public static boolean isFibonacci(int N) {
        int a = 1;
        int b = 1;

        while (b < N) {
            int temp = b;
            b += a;
            a = temp;
        }

        return b == N;
    }

}
