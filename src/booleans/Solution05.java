package booleans;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the Solution works for checking couple of inputs num A, B for"
                + "\nThe inequality A ≥ 0 is fulfilled or the inequality B < −2 is fulfilled");
        System.out.print("Enter Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        boolean aCheck = a >= 0;
        boolean bCheck = b <= -2;
        if (aCheck && bCheck) {
            System.out.printf("So the Both inequalities True %d (A) >= 0 , %d (B) <= -2 ", a, b);
        } else if (aCheck) {
            System.out.printf("So only one A inequality True %d >= 0", a);
        } else if (bCheck) {
            System.out.printf("So only one B inequality True %d <= -2", b);
        } else {
            System.out.printf("Neither of inequalities  are true %d > 2 nor %d <= 3 ", a, b);
        }
    }

}
