package integers;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert Two positive number A and B ");
        System.out.println("Remembering that A should be bigger than B (A>B)");
        System.out.println("The purpose of it is finding number of segments in  A which also belong to B");
        System.out.print("So let's start with A : ");
        int a = scanner.nextInt();
        System.out.print("Continuing With B: ");
        int b = scanner.nextInt();
        int result = a % b;
        System.out.printf("So the A = %d , and B = %d and segment between them is equal to %d", a, b, result);
    }
}
