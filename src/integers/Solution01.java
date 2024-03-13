package integers;

import java.util.Scanner;


public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Distance in Centimeters so i can turn it into meter : ");
        double centimeter = scanner.nextDouble();
        double meter = Double.parseDouble(String.format("%.2f", centimeter / 100));
        System.out.printf("The %s centimeters is equal to %s meters ", centimeter, meter);
    }
}
