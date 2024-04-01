package forSlotions;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given the price of 1 kg of sweets (as a real number)," +
                "\noutput the cost of 1.2, 1.4, …, 2 kg of these sweets");
        System.out.print("Enter the current price of sweet for kilo: ");
        double price = scanner.nextDouble();
        double kilos = 1;
        for (int i = 0; i < 5; i++) {
            kilos += 0.2;
            System.out.printf("So the %s kg amount of sweets cost %s price\n", kilos, price * kilos);
        }
    }
}
