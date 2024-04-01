package CaseSolutions;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given two integers D (day) and M (month) that represent a correct date,
                output the zodiacal name corresponding to this date: "Aquarius" 20.1–18.2,
                "Pisces" 19.2–20.3, "Aries" 21.3–19.4, "Taurus" 20.4–20.5, "Gemini" 21.5–21.6,
                "Cancer" 22.6–22.7, "Leo" 23.7–22.8, "Virgo" 23.8–22.9, "Libra" 23.9–22.10,
                "Scorpio" 23.10–22.11, "Sagittarius" 23.11–21.12, "Capricorn" 22.12–19.1
                """);
        System.out.print("Enter the day:");
        int day = scanner.nextInt();

        System.out.print("Enter the month:");
        int month = scanner.nextInt();

        if (!isValidDate(day, month)) {
            System.out.println("Invalid date.");
        } else {

            String zodiacSign = determineZodiacSign(day, month);

            System.out.println("Zodiacal sign: " + zodiacSign);
        }

    }

    public static boolean isValidDate(int day, int month) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month)) {
            return false;
        }
        return true;
    }
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }
    public static String determineZodiacSign(int day, int month) {
        String zodiacSign;
        switch (month) {
            case 1:
                if (day >= 20) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Capricorn";
                }
                break;
            case 2:
                if (day <= 18) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Pisces";
                }
                break;
            case 3:
                if (day <= 20) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
                break;
            case 4:
                if (day <= 19) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
                break;
            case 5:
                if (day <= 20) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
                break;
            case 6:
                if (day <= 21) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
                break;
            case 8:
                if (day <= 22) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
                break;
            case 9:
                if (day <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
                break;
            case 10:
                if (day <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
                break;
            case 11:
                if (day <= 22) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
                break;
            case 12:
                if (day <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
                break;
            default:
                zodiacSign = "Unknown";
        }
        return zodiacSign;
    }
}
