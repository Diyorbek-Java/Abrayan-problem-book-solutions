package forSlotions;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 2) is given. A sequence of integers AK is defined as:
                A1 = 1,A(2) = 2,A(3) = 3,A(K) = A(K−1) + A(K−2) − 2·A(K−3), K = 4, 5, … .
                Output terms A1, A2, …, AN of the sequence.""");
        System.out.print("Enter an integer N (> 2): ");
        int N = scanner.nextInt();

        int A1 = 1;
        int A2 = 2;
        int A3 = 3;

        System.out.println("Terms of the sequence:");
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

        for (int K = 4; K <= N; K++) {
            int AK = A3 + A2 - 2 * A1;
            System.out.println(AK);

            A1 = A2;
            A2 = A3;
            A3 = AK;
        }
    }
}
