package integers;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution finds which century it is with given input");
        System.out.print("Enter the Year Please: ");
        int year = scanner.nextInt();
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }
        System.out.printf("So the year %d is equal to %d century ", year, century);
    }
}
