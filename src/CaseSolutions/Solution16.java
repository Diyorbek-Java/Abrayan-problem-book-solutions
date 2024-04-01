package CaseSolutions;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an age in years (as an integer in the range 20 to 69),
                output its alphabetic equivalent as: "twenty years", "thirty-two years",
                "forty-one years", etc.
                """);
        System.out.print("Enter the age (an integer between 20 and 69):");
        int age = scanner.nextInt();


        if (age < 20 || age > 69) {
            System.out.println("Invalid input. Age must be between 20 and 69.");
        } else {
            String alphabeticAge = convertToAlphabetic(age);

            System.out.println(alphabeticAge + " years");
        }

    }

    public static String convertToAlphabetic(int age) {
        String tensNames, onesNames;

        int tens = age / 10;
        int ones = age % 10;

        switch (tens) {
            case 2:
                tensNames = "twenty";
                break;
            case 3:
                tensNames = "thirty";
                break;
            case 4:
                tensNames = "forty";
                break;
            case 5:
                tensNames = "fifty";
                break;
            case 6:
                tensNames = "sixty";
                break;
            default:
                tensNames = "";
        }

        // Switch-case to handle ones place
        switch (ones) {
            case 0:
                onesNames = "";
                break;
            case 1:
                onesNames = "one";
                break;
            case 2:
                onesNames = "two";
                break;
            case 3:
                onesNames = "three";
                break;
            case 4:
                onesNames = "four";
                break;
            case 5:
                onesNames = "five";
                break;
            case 6:
                onesNames = "six";
                break;
            case 7:
                onesNames = "seven";
                break;
            case 8:
                onesNames = "eight";
                break;
            case 9:
                onesNames = "nine";
                break;
            default:
                onesNames = "";
        }

        String alphabeticAge;
        if (tensNames.isEmpty()) {
            alphabeticAge = onesNames;
        } else if (onesNames.isEmpty()) {
            alphabeticAge = tensNames;
        } else {
            alphabeticAge = tensNames + "-" + onesNames;
        }

        return alphabeticAge;
    }
}
