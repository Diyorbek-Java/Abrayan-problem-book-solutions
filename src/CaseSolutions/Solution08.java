package CaseSolutions;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = scanner.nextInt();

        System.out.print("Enter the month:");
        int month = scanner.nextInt();

        int[] previousDate = findPreviousDate(day, month);
        System.out.println("Current date: " + day + " " + month);
        System.out.println("Previous date: " + previousDate[0] + " " + previousDate[1]);
    }

    public static int[] findPreviousDate(int day, int month) {
        int[] previousDate = new int[2];

        switch (day) {
            case 1:
                switch (month) {
                    case 1:
                        previousDate[0] = 31;
                        previousDate[1] = 12;
                        break;
                    default:
                        previousDate[0] = daysInMonth(month - 1);
                        previousDate[1] = month - 1;
                }
                break;
            default:
                previousDate[0] = day - 1;
                previousDate[1] = month;
        }

        return previousDate;
    }

    public static int daysInMonth(int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month - 1];
    }
}
