package arraySolutions;

import java.util.Scanner;

public class Solution002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Array of powers of 2 numbers until positive numbers N " + n);
        System.out.print("[");
        for (int i = 1; i < n; i += 2) {
            System.out.print(Math.pow(2, i) + ", ");
        }
        System.out.println("]");
        scanner.close();
    }
}
