package CaseSolutions;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the month we will write the season: ");
        int month = scanner.nextInt();
        String season = seasonName(month);
        System.out.printf(" the month number %d is in season %s", month, season);
    }

    public static String seasonName(int month) {
        return switch (month) {
            case 1 -> "bas";
            case 2 -> "Unsatisfactory";
            case 3 -> "mediocre";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> "error";
        };
    }
}
