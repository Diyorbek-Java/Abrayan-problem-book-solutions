package integers;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution finds How much time hours passed in the day according to input time in seconds");
        System.out.print("Please enter how much time(seconds) passed from the begin of the day: ");
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.printf("So the %s seconds passing is equal to %s hours passing in the day", seconds, hours);
    }
}
