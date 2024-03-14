package integers;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution works for finding. How much time hours and seconds passed during the day");
        System.out.print("Please enter how much time(seconds) passed from the begin of the day: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int reminderMinutes = (seconds % 3600) / 60;
        int reminderSeconds = (seconds % 3600) % 60;
        System.out.printf("So the %d seconds passing Means that %d hours and %d minutes and %d seconds passed during the day", seconds, hours, reminderMinutes, reminderSeconds);
    }
}
