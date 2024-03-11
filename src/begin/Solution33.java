package begin;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution Works like steelyard Give us the cost of the sweet price ");
        System.out.println("for some kilos and gives us the kilo you want to calculate the price");
        System.out.print("Enter kilo to price sweet: ");
        double kilo = scanner.nextDouble();
        System.out.print("Now enter the price of the sweet: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("How much kilos should I calculate for now : ");
        double calculatingKilo = scanner.nextDouble();
        double resultPrice = (calculatingKilo / kilo) * originalPrice;
        double priceFor1Kilo = (1 / kilo) * originalPrice;
        System.out.printf("So for 1 kilo sweet the price is %s\n", priceFor1Kilo);
        System.out.printf("So the Original Price for %s kilos is %s", kilo, originalPrice);
        System.out.printf("\nNow for %s kilos Price is %s", calculatingKilo, resultPrice);

    }

}
