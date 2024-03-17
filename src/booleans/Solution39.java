package booleans;

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking whether Queen can move from coordinates" +
                "(X,Y) to (X1,Y1) or (X1,Y1) to (X,Y)  in chess board in next turn");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        System.out.println("Please Enter coordinate x: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y1 = scanner.nextInt();
        if (canQueenMove(x, y, x1, y1)) {
            System.out.printf("A Queen can move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        } else {
            System.out.printf("A Queen cannot move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        }
    }

    public static boolean canQueenMove(int x1, int y1, int x2, int y2) {
        // Check if the squares are on the same row, column, or diagonal
        return x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }

}
