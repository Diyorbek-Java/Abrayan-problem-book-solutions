package arraySolutions60to120;

import java.util.Arrays;
import java.util.Scanner;

public class Solution065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers and an integer K (1 ≤ K ≤ N) are given.
                Increase the value of each element of A by the initial value of A(K).
                """);
        System.out.print("Enter the array size N: ");
        int n = scanner.nextInt();

        double[] arrayA = new double[n];
        System.out.println("Enter elements of Array A: ");
        for (int i = 0; i < n; i++)
            arrayA[i] = scanner.nextDouble();

        System.out.println("Enter integer K (1 ≤ K ≤ N): ");
        int k = scanner.nextInt();
        scanner.close();

        System.out.println("The array A is: ");
        System.out.println(Arrays.toString(arrayA));

        double increasing = arrayA[k-1];
        for (int i = 0; i < n; i++)
            arrayA[i] += increasing;
        System.out.println("The changed Array A is: ");
        System.out.println(Arrays.toString(arrayA));
    }


}
