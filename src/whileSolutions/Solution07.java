package whileSolutions;


import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0), find the smallest positive integer K such that its square is greater than N: K2 > N.
                Do not use the operation of extracting a root.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        System.out.printf(" The smallest positive integer that its square is greater than N = %d: K^2 > N. K = %d", n, k);
        scanner.close();
    }
}
