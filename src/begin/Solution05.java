package begin;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Place enter the edge of a cube: ");
        double edge = scanner.nextDouble();
        double volume = Math.pow(edge, 3);
        double surface = 6 * Math.pow(edge, 2);
        System.out.printf("The given Cube with edge = %s has volume = %s,surface = %s", edge, volume, surface);
    }
}
