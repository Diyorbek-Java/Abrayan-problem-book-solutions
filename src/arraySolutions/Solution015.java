package arraySolutions;

import java.util.Scanner;

public class Solution015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given. Output array elements with odd order numbers in ascending order of indices and
                then output array elements with even order numbers in descending order of indices:
                A1,    A3,    A5,    …,    A6,    A4,    A2.
                Do not use conditional statements.
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();

        System.out.println("Array elements with odd order numbers in ascending order of indices");
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Array elements with even order numbers in descending order of indices");
        for (int i = (n % 2 == 0 ? n - 1 : n - 2); i >= 0; i -= 2) {
            System.out.print(numbers[i] + " ");
        }
    }

}
