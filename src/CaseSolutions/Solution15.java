package CaseSolutions;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                The suits of playing cards are numbered as: 1 — spades, 2 — clubs, 3 — diamonds, 4 — hearts.
                Card values "Jack", "Queen", "King", "Ace" are numbered as 11, 12, 13, 14 respectively.
                A card value N (as an integer in the range  6 to 14) and a suit M (as an integer in the range 1 to 4) are given.
                Output the card description as: "six of diamonds", "queen of spades", etc
                """);
        System.out.print("Enter the card value (an integer between 6 and 14): ");
        int cardValue = scanner.nextInt();

        System.out.print("Enter the suit (1 for spades, 2 for clubs, 3 for diamonds, 4 for hearts): ");
        int suit = scanner.nextInt();

        if (cardValue < 6 || cardValue > 14 || suit < 1 || suit > 4) {
            System.out.println("Invalid input.");
        } else {
            String cardDescription = getCardDescription(cardValue);

            String suitDescription = getSuitDescription(suit);

            System.out.println(cardDescription + " of " + suitDescription);
        }

    }

    public static String getCardDescription(int cardValue) {
        String description;
        switch (cardValue) {
            case 6:
                description = "six";
                break;
            case 7:
                description = "seven";
                break;
            case 8:
                description = "eight";
                break;
            case 9:
                description = "nine";
                break;
            case 10:
                description = "ten";
                break;
            case 11:
                description = "jack";
                break;
            case 12:
                description = "queen";
                break;
            case 13:
                description = "king";
                break;
            case 14:
                description = "ace";
                break;
            default:
                description = "unknown";
        }
        return description;
    }


    public static String getSuitDescription(int suit) {
        String description;
        switch (suit) {
            case 1:
                description = "spades";
                break;
            case 2:
                description = "clubs";
                break;
            case 3:
                description = "diamonds";
                break;
            case 4:
                description = "hearts";
                break;
            default:
                description = "unknown";
        }
        return description;
    }

}
