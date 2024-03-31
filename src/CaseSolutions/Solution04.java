package CaseSolutions;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the month we will write number of days in that month: ");
        int month = scanner.nextInt();
        int days = numberOfDays(month);
        System.out.printf(" the month number %d there are %d days", month, days);
    }

    public static int numberOfDays(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
    }
}
