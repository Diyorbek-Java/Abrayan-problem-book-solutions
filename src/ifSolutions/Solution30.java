package ifSolutions;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer in the range 1 to 999 is given.
                Output its description string as: "two-digit even number",
                "three-digit odd number", etc.
                """);
        System.out.print("Enter the year : ");
        int number = scanner.nextInt();
        String description = describeNumber(number);
        System.out.printf("Description of number %d is %s", number, description);
    }

    public static String describeNumber(int number) {
        if (number >= 1 && number <= 9) {
            return "one-digit number";
        } else if (number >= 10 && number <= 99) {
            return (number % 2 == 0) ? "two-digit even number" : "two-digit odd number";
        } else if (number >= 100 && number <= 999) {
            return (number % 2 == 0) ? "three-digit even number" : "three-digit odd number";
        } else {
            return "Number out of range";
        }
    }
}
