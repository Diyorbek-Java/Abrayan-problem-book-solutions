package integers;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution finds How much time minutes and seconds passed during the day");
        System.out.print("Please enter how much time(seconds) passed from the begin of the day: ");
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int reminderSeconds = seconds % 60;
        System.out.printf("So the %d seconds passing is equal to %d minutes and %d seconds passing in the day", seconds, minutes, reminderSeconds);
    }
}
