package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given (N is an even number).
                Output array elements with even order numbers in ascending order of indices:
                A(2), A(4), A(6), …, A(N). Do not use conditional statements.
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();

        double[] results = new double[n / 2];
        for (int i = 2; i < n; i += 2) {
            results[i] = numbers[i];
        }

        Arrays.sort(numbers);
        System.out.println("So the elements with even order in ascending order are:");
        System.out.println(Arrays.toString(numbers));
    }

}
