package whileSolutions;


import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real number ε (> 0) is given. A sequence of real numbers A(K) is defined as:
                A1 = 2,        A(K) = 2 + 1/A(K)−1,    K = 2, 3, … .
                Find the first index K such that the inequality |A(K) − A(K−1)| < ε is fulfilled. Output the index K and the terms A(K)−1 and A(K).
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
