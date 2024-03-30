package ifSolutions;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a number of year (as a positive integer), find the amount of days in the year.
                Note that the length of year is 365 days for an ordinary year and 366 days for a leap year.
                A leap year is every year whose number is divisible by 4, as 1980, except centenary years
                that are not divisible by 400 (for example, 1300 and 1900 are ordinary years, 1200 and 2000 are leap years).
                """);
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("Year %d contains 366 days ", year);
        } else {
            System.out.printf("Year %d contains 365 days ", year);
        }
    }
}
