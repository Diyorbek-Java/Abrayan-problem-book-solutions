package whileSolutions;


import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 1), find the first Fibonacci number greater than N (see the Fibonacci numbers definition in While24).
                """);
        System.out.print("Enter the first positive integer N: ");
        int n = scanner.nextInt();
        int prevFibonacci = findPreviousFibonacci(n);
        int nextFibonacci = findNextFibonacci(n);

        System.out.println("Previous Fibonacci number: " + prevFibonacci);
        System.out.println("Next Fibonacci number: " + nextFibonacci);
        scanner.close();
    }

    // Function to find the previous Fibonacci number
    public static int findPreviousFibonacci(int N) {
        int a = 0;
        int b = 1;

        // Find the previous Fibonacci number
        while (b < N) {
            int temp = b;
            b += a;
            a = temp;
        }

        return a;
    }

    // Function to find the next Fibonacci number
    public static int findNextFibonacci(int N) {
        int a = 0;
        int b = 1;

        // Find the next Fibonacci number
        while (b < N) {
            int temp = b;
            b += a;
            a = temp;
        }

        return b;
    }
}
