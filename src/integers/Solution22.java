package integers;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution works for finding. How much time hours and seconds passed during the day");
        System.out.print("Please enter how much time(seconds) passed from the begin of the day: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int reminderSeconds = seconds % 3600;
        System.out.printf("So the %d seconds passing Means %d hours and %d seconds passed during the day", seconds, hours, reminderSeconds);
    }
}
