package arraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An array A of N real numbers is given. Output array elements with even order numbers (in ascending order of indices)
                and then output array elements with odd order numbers (in ascending order of indices too):
                A2,    A4,    A6,    …,    A1,    A3,    A5,    … .
                Do not use conditional statements
                """);
        System.out.print("Enter the size of array N : ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextDouble();
        scanner.close();

        System.out.println("Array elements in Even order");
        for (int i = 1; i < n; i += 2) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Arrays elements in ODD order:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }

}
