package booleans;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution needs one input numbers and it checks number is three-digit and odd");
        System.out.print("Enter Number Please : ");
        int a = scanner.nextInt();
        boolean result = checkNumber(a);
        System.out.printf("Well the given number %d is three-digit and odd is : " + result, a);
    }

    public static boolean checkNumber(int number) {
        return number / 100 <= 9 && number / 100 > 0 && number % 2 != 0;
    }

}
