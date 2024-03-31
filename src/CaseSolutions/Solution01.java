package CaseSolutions;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the week i will tell you name of that day :");
        int dayNumber = scanner.nextInt();
        String dayName = getDayOfWeek(dayNumber);
        System.out.printf("Day %d corresponds to: %s", dayNumber, dayName);
    }

    public static String getDayOfWeek(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number";
        };
    }
}
