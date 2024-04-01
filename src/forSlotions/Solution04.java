package forSlotions;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given the price of 1 kg of sweets (as a real number)," +
                "\noutput the cost of 1, 2, …, 10 kg of these sweets.");
        System.out.print("Enter the price of sweet for a kilo: ");
        double price = scanner.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("The price of sweet for %d kilos is %s\n", i, price * i);
        }
    }
}
