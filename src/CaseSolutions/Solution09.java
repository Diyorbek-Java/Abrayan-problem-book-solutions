package CaseSolutions;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = scanner.nextInt();

        System.out.println("Enter the month:");
        int month = scanner.nextInt();

        // Calculate the next date
        int[] nextDate = findNextDate(day, month);


        System.out.println("Next date: " + nextDate[0] + " " + nextDate[1]);
    }

    public static int[] findNextDate(int day, int month) {
        int[] nextDate = new int[2];

        if (day == daysInMonth(month)) {
            if (month == 12) {
                nextDate[0] = 1;
                nextDate[1] = 1;
            } else {
                nextDate[0] = 1;
                nextDate[1] = month + 1;
            }
        } else {
            nextDate[0] = day + 1;
            nextDate[1] = month;
        }

        return nextDate;
    }
    public static int daysInMonth(int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month - 1];
    }
}
