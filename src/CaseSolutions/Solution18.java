package CaseSolutions;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer in the range 100 to 999, output its alphabetic equivalent.
                For example, 100 — "one hundred", 256 — "two hundred and fifty-six",
                814 — "eight hundred and fourteen", 901 — "nine hundred and one"
                """);
        System.out.print("Enter an integer between 100 and 999:");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid input. Number must be between 100 and 999.");
        } else {
            String alphabeticEquivalent = convertToWords(number);

            System.out.println(alphabeticEquivalent);
        }


    }

    public static String convertToWords(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        String hundredsWord = once(hundreds) + "hundred";
        String tensName = tensWord(tens);
        String onesName = once(ones);
        return hundredsWord + tensName + onesName;
    }

    public static String once(int ones) {
        return switch (ones) {
            case 1 -> " one";
            case 2 -> " two";
            case 3 -> " three";
            case 4 -> " four";
            case 5 -> " five";
            case 6 -> " six";
            case 7 -> " seven";
            case 8 -> " eight";
            case 9 -> " nine";
            default -> "error";
        };
    }

    public static String tensWord(int ones) {
        return switch (ones) {
            case 2 -> " twenty";
            case 3 -> " thirty";
            case 4 -> " forty";
            case 5 -> " fifty";
            case 6 -> " sixty";
            case 7 -> " seventy";
            case 8 -> " eighty";
            case 9 -> " ninety";
            default -> "error";
        };
    }
}
