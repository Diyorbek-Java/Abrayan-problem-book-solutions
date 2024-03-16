package booleans;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the Solution works for checking couple of inputs num A, B for"
                + "\nThe inequalities A > 2 and B ≤ 3 both are fulfilled");
        System.out.print("Please Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Please Enter B: ");
        int b = scanner.nextInt();
        boolean aCheck = a > 2;
        boolean bCheck = b <= 3;
        if (aCheck && bCheck) {
            System.out.printf("So the Both inequalities True %d (A) > 2 , %d (B)<=3 ", a, b);
        } else if (aCheck) {
            System.out.printf("So only one A inequality True %d > 2", a);
        } else if (bCheck) {
            System.out.printf("So only one B inequality True %d <= 3", b);
        } else {
            System.out.printf("Both inequalities failed for checking %d > 2 False and %d <= 3 False ", a, b);
        }
    }

}
