package booleans;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs three input numbers and it checks least one pair of opposite ones");
        System.out.print("Enter Number A : ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B : ");
        int b = scanner.nextInt();
        System.out.print("Enter Number C : ");
        int c = scanner.nextInt();
        if ((a == -b) || (a == -c) || (b == -c)) {
            System.out.println("Among the three given integers, there is at least one pair of opposite ones.");
        } else {
            System.out.println("Among the three given integers, there are no opposite pairs.");
        }
    }


}
