package booleans;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking whether Knight can move from coordinates" +
                "(X,Y) to (X1,Y1) or (X1,Y1) to (X,Y)  in chess board in next turn");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        System.out.println("Please Enter coordinate x: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y1 = scanner.nextInt();
        if (canKnightMove(x, y, x1, y1)) {
            System.out.printf("A Knight can move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        } else {
            System.out.printf("A Knight cannot move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        }
    }

    public static boolean canKnightMove(int x, int y, int x1, int y1) {
        int xCheck = Math.abs(x - x1);
        int yCheck = Math.abs(y - y1);

        // Check if the move is in L-shape: (2, 1) or (1, 2)
        return (xCheck == 1 && yCheck == 2) || (xCheck == 2 && yCheck == 1);
    }

}
