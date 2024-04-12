package whileSolutions;


import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 1), find the first Fibonacci number greater than N (see the Fibonacci numbers definition in While24).
                """);
        System.out.print("Enter the first positive integer N: ");
        int n = scanner.nextInt();
        int fibonacci = findNextFibonacci(n);

        System.out.println("The first Fibonacci number greater than " + n + " is: " + fibonacci);
        scanner.close();
    }

    // Function to find the first Fibonacci number greater than N
    public static int findNextFibonacci(int N) {
        int a = 1;
        int b = 1;

        // Find the next Fibonacci number greater than N
        while (b <= N) {
            int temp = b;
            b += a;
            a = temp;
        }

        return b;
    }
}
