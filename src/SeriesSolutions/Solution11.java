package SeriesSolutions;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers K, N and a sequence of N integers are given.
                Output the logical value True if the sequence contains elements of value less than K, otherwise output False.""");
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();


        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();


        System.out.println("Enter the sequence of integers:");
        boolean containsLessThanK = false;
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num < K) {
                containsLessThanK = true;
                break;  // Once we find an element less than K, we don't need to continue checking the rest of the sequence
            }
        }

        System.out.println("The sequence contains elements of value less than " + K + ": " + containsLessThanK);

        scanner.close();
    }

}
