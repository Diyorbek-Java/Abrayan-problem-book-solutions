package forSlotions;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given two integers A and B (A < B), output in ascending order all integers " +
                "\nin the range A to B (including A and B). Also output the amount N of these integers");
        System.out.print("Enter the number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number B: ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + ", ");
        }
        System.out.printf("There are %d amount of integers", b - a);
    }
}
