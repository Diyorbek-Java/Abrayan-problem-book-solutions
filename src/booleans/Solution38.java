package booleans;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking whether bishop can move from coordinates" +
                "(X,Y) to (X1,Y1) or (X1,Y1) to (X,Y)  in chess board in next turn");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        System.out.println("Please Enter coordinate x: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y1 = scanner.nextInt();
        if (canBishopMove(x, y, x1, y1)) {
            System.out.printf("A bishop can move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        } else {
            System.out.printf("A bishop cannot move from (%d,%d) to (%d,%d) in one turn", x, y, x1, y1);
        }
    }

    public static boolean canBishopMove(int x, int y, int x1, int y1) {
        // Check if the absolute difference in x and y coordinates is the same
        int dx = Math.abs(x - x1);
        int dy = Math.abs(y - y1);
        return dx == dy;
    }


}
