package arraySolutions;

import java.util.Scanner;

public class Solution001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Array of odd numbers until N " + n);
        System.out.print("[");
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        scanner.close();
    }
}
