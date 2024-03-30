package ifSolutions;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer, output its description string as:
                 "negative even number", "zero number", "positive odd number", etc.
                """);
        System.out.print("Enter the year : ");
        int number = scanner.nextInt();
        String description = describeNumber(number);
        System.out.printf("Description of number %d is %s", number, description);
    }

    public static String describeNumber(int number) {
        if (number == 0) {
            return "zero number";
        } else if (number > 0) {
            return (number % 2 == 0) ? "positive even number" : "positive odd number";
        } else {
            return (number % 2 == 0) ? "negative even number" : "negative odd number";
        }
    }
}
