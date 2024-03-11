package begin;

import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In here Solution changes Centigrade temperature into Fahrenheit temperature");
        System.out.print("Enter Temperature in Centigrade : ");
        double temperatureCentigrade = scanner.nextDouble();
        double temperatureFahrenheit = (temperatureCentigrade * ((double) 9 / 5)) + 32;
        System.out.printf("Temperate is Centigrade  = %s , is Equal to Fahrenheit = %s ", temperatureCentigrade, temperatureFahrenheit);
    }

}
