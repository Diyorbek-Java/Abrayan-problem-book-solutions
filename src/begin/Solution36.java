package begin;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solution is for finding the distance between Two cars");
        System.out.print("Enter the Speed of the First Car: ");
        double speedCar1 = scanner.nextDouble();
        System.out.print("Enter the Speed of the Second Car : ");
        double speedCar2 = scanner.nextDouble();
        System.out.print("Enter the current distance between cars: ");
        double currentDistance = scanner.nextDouble();
        System.out.print("How much hours did the divers drive the car: ");
        double time = scanner.nextDouble();
        double distanceAfter = ((speedCar1 + speedCar2) * time) + currentDistance;
        String fDistanceAfter = String.format("%.2f", distanceAfter);
        System.out.printf("The fist distance was %s km it after become %s km in %s hours ", currentDistance, fDistanceAfter, time);
        System.out.printf("\nThe car1 speed was %s and speed of the second one is %s", speedCar1, speedCar2);


    }

}
