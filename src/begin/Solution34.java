package begin;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution Works like steelyard give us the cost of the chocolate price ");
        System.out.println("for some kilos and gives us the kilo you want to calculate the price");
        System.out.println("This same like this For the Sugar");
        System.out.print("So let's start with Enter kilo to price Chocolate: ");
        double kiloOfChocolate = scanner.nextDouble();
        System.out.print("Now Enter the Price Of it: ");
        double priceOfChocolate = scanner.nextDouble();
        System.out.print("Now kilo of the sugar: ");
        double kiloOfSugar = scanner.nextDouble();
        System.out.print("And the price of it: ");
        double priceOfSigar = scanner.nextDouble();
        double costOfOneKiloChocolate = (1 / kiloOfChocolate) * priceOfChocolate;
        String formatChP = String.format("%.2f", costOfOneKiloChocolate);
        double costOfOneKiloSugar = (1 / kiloOfSugar) * priceOfSigar;
        String formatSP = String.format("%.2f", costOfOneKiloSugar);
        double difference = costOfOneKiloChocolate / costOfOneKiloSugar;
        String formatD = String.format("%.2f", difference);
        System.out.printf("Well according to data you gave One kilo Chocolate costs %s and One kilo sugar costs %s ", formatChP, formatSP);
        System.out.printf("And Chocolate is %s times expensive than sugar", formatD);
    }

}
