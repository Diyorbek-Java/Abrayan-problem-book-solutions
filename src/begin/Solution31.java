package begin;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Solution changes Fahrenheit temperature into centigrade temperature");
        System.out.print("Enter Temperature in Fahrenheit : ");
        double temperatureFahrenheit = scanner.nextDouble();
        double temperatureCentigrade = (temperatureFahrenheit - 32) / ((double) 5 / 9);
        System.out.printf("Temperate is Fahrenheit  = %s , is Equal to centigrade = %s ", temperatureFahrenheit, temperatureCentigrade);
    }

}
