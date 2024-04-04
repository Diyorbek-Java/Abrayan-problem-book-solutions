package forSlotions;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("An integer N (> 1) and two points A, B (A < B) on the real axis are given. The segment [A, B] is divided into N sub-segments of equal length. Output the length H of each sub-segment and then output the sequence of points\n" +
                "A,A + H,A + 2·H,A + 3·H,…,B,\n" +
                "which forms a partition of the segment [A, B].");
        System.out.print("Enter an integer N (> 1): ");
        int N = scanner.nextInt();

        System.out.print("Enter point A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter point B (B > A): ");
        double B = scanner.nextDouble();

        double H = (B - A) / N;

        System.out.println("The length of each sub-segment is: " + H);

        System.out.println("Sequence of points:");
        for (int i = 0; i <= N; i++) {
            double point = A + i * H;
            System.out.println(point);
        }
    }
}
