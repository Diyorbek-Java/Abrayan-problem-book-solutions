package SeriesSolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N integers are given.
                Output the logical value True if the sequence contains positive-valued elements, otherwise output False
                """);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();


        System.out.println("Enter the sequence of integers:");
        boolean containsPositive = false;
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                containsPositive = true;
                break;  // Once we find a positive number, we don't need to continue checking the rest of the sequence
            }
        }

        System.out.println("The sequence contains positive-valued elements: " + containsPositive);

        scanner.close();
    }

}
