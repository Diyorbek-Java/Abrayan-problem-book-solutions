package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given (N is an odd number).
                Output array elements with odd order numbers in descending order of indices:
                A(N), A(N−2), A(N−4), …, A(1). Do not use conditional statements.
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();

        double[] result = new double[n / 2];
        int index = 0;
        for (int i = n - 1; i >= 1; i -= 2) {
            result[index++] = numbers[i];
        }

        System.out.println("The result is : ");
        System.out.println(Arrays.toString(result));
    }

}
