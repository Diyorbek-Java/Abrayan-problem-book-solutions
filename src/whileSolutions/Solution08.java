package whileSolutions;


import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0), find the largest integer K such that its square is not greater than N: K2 ≤ N.
                Do not use the operation of extracting a root
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        k--;
        System.out.printf("The smallest positive integer that proves that N = %d: K^2 > N K = %d", n, k);
        scanner.close();
    }
}
