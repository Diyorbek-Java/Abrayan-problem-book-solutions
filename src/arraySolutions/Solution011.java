package arraySolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers and an integer K (1 ≤ K ≤ N) are given. Output array elements with order numbers
                that are multiples of K: A(K), A(2·K), A(3·K), … . Do not use conditional statements.
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        System.out.print("Enter the number K : ");
        int k = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();
        System.out.print("The result is ");
        for (int i = k - 1; i < n; i += k) {
            System.out.println(numbers[i]);
        }
    }

}
