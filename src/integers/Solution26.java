package integers;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the purpose of the Solution is to finding the WeekDay according to the number of days passed on a year");
        System.out.println("It is Considered as January 1 is ThursDay");
        System.out.print("Please enter number of day: ");
        int days = scanner.nextInt();
        if (days > 365) {
            System.out.printf("%d This number is far more than a year", days);
            return;
        }
        int day = (4 + days - 1) % 7;
        String weekDay;
        switch (day) {
            case 0 -> weekDay = "Sunday";
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wednesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            default -> weekDay = "Saturday";
        }
        System.out.printf("So the day %d is equal to day %s in week", days, weekDay);
    }
}
