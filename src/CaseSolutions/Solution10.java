package CaseSolutions;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A robot can move in four directions ("N" — north, "W" — west, "S" — south, "E" — east)
                and perform three digital instructions: 0 — "move in the former direction", 1 — "turn left", −1 — "turn right".
                A symbol C (an initial direction of the robot) and an integer N (an instruction) are given.
                Output the direction of the robot (as symbol) after performing the instruction.
                """);

        System.out.print("Enter the initial direction (N, W, S, or E):");
        char initialDirection = scanner.next().toLowerCase().charAt(0);

        System.out.print("Enter the instruction (0 for move, 1 for turn left, -1 for turn right):");
        int instruction = scanner.nextInt();

        char finalDirection = calculateDirection(initialDirection, instruction);

        System.out.println("Final direction: " + finalDirection);

    }

    public static char calculateDirection(char initialDirection, int instruction) {
        char finalDirection = ' ';

        switch (instruction) {
            case 0:
                finalDirection = initialDirection;
                break;
            case 1:
                switch (initialDirection) {
                    case 'N':
                        finalDirection = 'W';
                        break;
                    case 'W':
                        finalDirection = 'S';
                        break;
                    case 'S':
                        finalDirection = 'E';
                        break;
                    case 'E':
                        finalDirection = 'N';
                        break;
                }
                break;
            case -1:
                switch (initialDirection) {
                    case 'N':
                        finalDirection = 'E';
                        break;
                    case 'E':
                        finalDirection = 'S';
                        break;
                    case 'S':
                        finalDirection = 'W';
                        break;
                    case 'W':
                        finalDirection = 'N';
                        break;
                }
                break;
            default:
                System.out.println("Invalid instruction.");
        }

        return finalDirection;
    }


}
