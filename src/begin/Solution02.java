package begin;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        double side = scanner.nextDouble();
        double surface = side * side;
        System.out.printf("Surface of the Square with the given side %s is %s", side, surface);

    }
}
