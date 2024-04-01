package CaseSolutions;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an order number of some training task (as an integer in the range 10 to 40),
                output its alphabetic equivalent as: "the eighteenth task", "the twenty-third task",
                "the thirtieth task", etc.
                """);
        System.out.print("Enter the order number of the task (an integer between 10 and 40):");
        int orderNumber = scanner.nextInt();

        if (orderNumber < 10 || orderNumber > 40) {
            System.out.println("Invalid input. Order number must be between 10 and 40.");
        } else {
            String alphabeticEquivalent = convertToAlphabetic(orderNumber);

            System.out.println("The " + alphabeticEquivalent + " task");
        }

    }

    public static String convertToAlphabetic(int orderNumber) {
        String[] onesNames = {
                "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth"
        };
        String[] tensNames = {
                "", "tenth", "twentieth", "thirtieth", "fortieth"
        };

        if (orderNumber < 10) {
            return onesNames[orderNumber];
        }

        int tens = orderNumber / 10;
        int ones = orderNumber % 10;

        return tensNames[tens] + (ones != 0 ? "-" + onesNames[ones] : "");
    }
}
