package begin;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution is for finding the distance bout swim around the river");
        System.out.print("Enter the Speed of the boat in still water: ");
        double boatStillWater = scanner.nextDouble();
        System.out.print("Enter the Speed of the River flow : ");
        double riverSpeed = scanner.nextDouble();
        System.out.print("Now how much time did  the boat swim along with river: ");
        double timeAlongWith = scanner.nextDouble();
        System.out.print("Now how much time did the boat swim against the river: ");
        double timeAgainst = scanner.nextDouble();
        double distanceWithFlow = (boatStillWater + riverSpeed) * timeAlongWith;
        String formattedDWF = String.format("%.2f", distanceWithFlow);
        double distanceAgainst = (boatStillWater - riverSpeed) * timeAgainst;
        String formattedDA = String.format("%.2f", distanceAgainst);
        System.out.printf("Well with speed of %s boat manage to swim %s distance with river in %s time", boatStillWater, formattedDWF, timeAlongWith);
        System.out.printf("\nnow against river boat manage to swim %s distance in %s time", formattedDA, timeAgainst);
    }

}
