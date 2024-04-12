package whileSolutions;


import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 1), find the first Fibonacci number greater than N (see the Fibonacci numbers definition in While24).
                """);
        System.out.print("Enter the first positive integer N: ");
        int n = scanner.nextInt();
        int orderNumber = findFibonacciOrder(n);

        System.out.println("Order number of Fibonacci number " + n + ": " + orderNumber);
        scanner.close();
    }

    public static int findFibonacciOrder(int N) {
        int a = 0;
        int b = 1;
        int order = 1;

        // Find the Fibonacci number and its order number
        while (b != N) {
            int temp = b;
            b += a;
            a = temp;
            order++;
        }

        return order;
    }

}
