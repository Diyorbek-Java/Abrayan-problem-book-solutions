package booleans;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs one input numbers and it checks number is two-digit and even");
        System.out.print("Enter Number Please : ");
        int a = scanner.nextInt();
        boolean result = checkNumber(a);
        System.out.printf("Well the given number %d is two-digit and even is : " + result, a);
    }

    public static boolean checkNumber(int number) {
        return number / 10 <= 9 && number % 2 == 0;
    }

}
