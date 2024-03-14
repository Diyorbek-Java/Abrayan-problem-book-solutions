package integers;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Solution finds how much minutes passed according to given input in seconds:");
        System.out.print("Please enter how much time passed from the begin of the day: ");
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        System.out.printf("So the %s seconds passing is equal to %s minutes passing in the day", seconds, minutes);
    }
}
