package CaseSolutions;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the mark i will give you the description of it ");
        int mark = scanner.nextInt();
        String markDescription = markExamination(mark);
        System.out.printf("Mark %d considered as %s", mark, markDescription);
    }

    public static String markExamination(int mark) {
        return switch (mark) {
            case 1 -> "bas";
            case 2 -> "Unsatisfactory";
            case 3 -> "mediocre";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> "error";
        };
    }
}
