package booleans;

import java.util.Scanner;

public class Solution37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking whether king can move from coordinates" +
                "(X,Y) to (X1,Y1) or (x1,y1) to (x,y)  in chess board in next turn");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        System.out.println("Please Enter coordinate x: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y1 = scanner.nextInt();
        if (canKingMove(x, y, x1, y1)) {
            System.out.printf("A king can move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        } else {
            System.out.printf("A king cannot move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        }
    }

    public static boolean canKingMove(int x, int y, int x1, int y1) {
        int xCheck = Math.abs(x - x1);
        int yCheck = Math.abs(y - y1);
        return xCheck <= 1 && yCheck <= 1;
    }


}
