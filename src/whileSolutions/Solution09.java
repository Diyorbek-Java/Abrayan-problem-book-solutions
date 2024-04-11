package whileSolutions;


import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 1), find the smallest integer K such that the inequality 3^K > N is fulfilled.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int k = 0;
        int pow = 1;
        while (pow <= n) {
            pow *= 3;
            k++;
        }
        System.out.printf("The smallest positive integer that approves while N = %d 3^K > N. K is %d ", n, k);
        scanner.close();
    }
}
