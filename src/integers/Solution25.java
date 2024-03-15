package integers;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the purpose of the Solution is to finding the WeekDay according to the number of days passed on a year");
        System.out.print("Please enter number of days passed from This year : ");
        int days = scanner.nextInt();
        if (days > 365) {
            System.out.printf("%d This number is far more than a year", days);
            return;
        }
        int weekDay = (days) % 7;
        String nameOFTheWeekDay;
        switch (weekDay) {
            case 0 -> nameOFTheWeekDay = "Sunday";
            case 1 -> nameOFTheWeekDay = "Monday";
            case 2 -> nameOFTheWeekDay = "Tuesday";
            case 3 -> nameOFTheWeekDay = "Wednesday";
            case 4 -> nameOFTheWeekDay = "Thursday";
            case 5 -> nameOFTheWeekDay = "Friday";
            default -> nameOFTheWeekDay = "Saturday";
        }
        System.out.printf("So the day %d is equal to day %s in week", days, nameOFTheWeekDay);
    }
}
