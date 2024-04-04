package forSlotions;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. An integer-valued sequence of the Fibonacci numbers FK is defined as:
                F1 = 1,F2 = 1,FK = FK−2 + FK−1,K = 3, 4, … .
                Output terms F1, F2, …, FN of the sequence.""");
        System.out.print("Enter an integer N (> 0): ");
        int N = scanner.nextInt();

        System.out.println("Terms of the sequence:");
        int F1 = 1;
        int F2 = 1;
        System.out.println(F1);
        System.out.println(F2);

        for (int K = 3; K <= N; K++) {
            int FK = F1 + F2;
            System.out.println(FK);

            F1 = F2;
            F2 = FK;
        }
    }
}
