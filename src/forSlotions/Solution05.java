package forSlotions;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given the price of 1 kg of sweets (as a real number)," +
                "\noutput the cost of 0.1, 0.2, …, 1 kg of these sweets");
        System.out.print("Enter the price of sweet for a kilo: ");
        double price = scanner.nextDouble();
        double kilos = 0;
        for (int i = 0; i < 10; i++) {
            kilos += 0.1;
            System.out.printf("So the %s kg amount of sweets cost %s price\n", kilos, price * kilos);
        }
    }
}
