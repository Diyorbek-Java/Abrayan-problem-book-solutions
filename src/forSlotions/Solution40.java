package forSlotions;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Integers A and B (A < B) are given.
                Output all integers in the range A to B,
                with the number A being output once,
                the number A + 1 being output twice, and so on.
                """);
        System.out.print("Enter integer A: ");
        int A = scanner.nextInt();

        System.out.print("Enter integer B (greater than A): ");
        int B = scanner.nextInt();

        System.out.println("Output:");
        for (int i = A; i <= B; i++) {
            for (int j = 0; j < i - A + 1; j++) {
                System.out.println(i);
            }
        }
    }
}
