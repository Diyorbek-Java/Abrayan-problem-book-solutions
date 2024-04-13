package SeriesSolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N and a sequence of N integers are given.
                Output in the same order the order numbers of all odd-valued elements of the sequence and also their amount K.
                """);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of integers:");
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sequence.add(scanner.nextInt());
        }

        System.out.println("Order numbers of odd-valued elements:");
        int K = 0;
        for (int i = 0; i < N; i++) {
            if (sequence.get(i) % 2 != 0) {
                System.out.print((i + 1) + " ");
                K++;
            }
        }
        System.out.println("\nAmount of odd-valued elements: " + K);
        scanner.close();
    }

}
