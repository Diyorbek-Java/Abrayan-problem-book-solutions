package forSlotions;

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Positive integers A and B (A < B) are given.
                Output all integers in the range A to B,
                with an integer of a value K being output K times
                (for example, the number 3 must be output 3 times)
                """);
        System.out.print("Enter a positive integer A: ");
        int A = scanner.nextInt();

        System.out.print("Enter a positive integer B (greater than A): ");
        int B = scanner.nextInt();

        System.out.println("Output:");
        for (int i = A; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
            }
        }
    }
}
