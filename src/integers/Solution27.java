package integers;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the purpose of the Solution is to finding the WeekDay according to the number of days passed on a year");
        System.out.println("It is Considered as January 1 is Saturday");
        System.out.print("Please enter number of days: ");
        int numberOfDays = scanner.nextInt();
        if (numberOfDays > 365) {
            System.out.printf("%d This number is far more than a year", numberOfDays);
            return;
        }
        int day = (7 + numberOfDays - 1) % 7;
        String weekDay;
        switch (day + 1) {
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wednesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            case 6 -> weekDay = "Saturday";
            default -> weekDay = "Sunday";
        }
        System.out.printf("So the day %d is equal to day %s in week", numberOfDays, weekDay);
    }
}
