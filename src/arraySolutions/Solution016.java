package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given. Output array elements as follows:
                A(1),    A(N),    A(2),    A(N−1),    A(3),    A(N−2),    … .
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();

        System.out.println("Given array: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Changed elements according to Solution: ");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(numbers[i] + " ");
            System.out.print(numbers[n - 1 - i] + " ");
        }

        // If N is odd, output the middle element
        if (n % 2 != 0) {
            System.out.print(numbers[n / 2] + " ");
        }
    }

}
