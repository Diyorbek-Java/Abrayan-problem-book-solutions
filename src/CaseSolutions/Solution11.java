package CaseSolutions;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A locator can be focused on the directions "N" (north), "W" (west), "S" (south), "E" (east)
                and perform three digital instructions: 1 — "turn left", −1 — "turn right", 2 — "turn on 180°").
                A symbol C (an initial direction of the locator) and two integers N1 and N2 (instructions) are given.
                Output the direction of the locator (as symbol) after performing the instructions.
                """);

        System.out.print("Enter the initial direction (N, W, S, or E):");
        char initialDirection = scanner.next().toLowerCase().charAt(0);

        System.out.print("Enter the instruction (1 for turn left, -1 for turn right,2 - for moving  180):");
        int instruction = scanner.nextInt();

        char finalDirection = calculateDirection(initialDirection, instruction);


        System.out.println("Final direction: " + String.valueOf(finalDirection).toUpperCase());

    }

    public static char calculateDirection(char initialDirection, int instruction) {
        char finalDirection = ' ';

        switch (instruction) {
            case 0:
                switch (initialDirection){
                    case 'n':
                        finalDirection = 's';
                        break;
                    case 'w':
                        finalDirection = 'e';
                        break;
                    case 's':
                        finalDirection = 'n';
                        break;
                    case 'e':
                        finalDirection = 'w';
                        break;
                }
                break;
            case 1:
                switch (initialDirection) {
                    case 'n':
                        finalDirection = 'w';
                        break;
                    case 'w':
                        finalDirection = 's';
                        break;
                    case 's':
                        finalDirection = 'e';
                        break;
                    case 'e':
                        finalDirection = 'n';
                        break;
                }
                break;
            case -1:
                switch (initialDirection) {
                    case 'n':
                        finalDirection = 'e';
                        break;
                    case 'e':
                        finalDirection = 's';
                        break;
                    case 's':
                        finalDirection = 'w';
                        break;
                    case 'w':
                        finalDirection = 'n';
                        break;
                }
                break;
            default:
                System.out.println("Invalid instruction.");
        }

        return finalDirection;
    }


}
