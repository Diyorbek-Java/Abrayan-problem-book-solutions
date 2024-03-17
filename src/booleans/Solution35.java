package booleans;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking coordinates (X,Y),(X1,Y1) are the same color in chess board ");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        System.out.println("Please Enter coordinate x: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y1 = scanner.nextInt();
        if (isSameColor(x, y, x1, y1)) {
            System.out.println("Both of the given chessboard squares have the same color.");
        } else {
            System.out.println("The given chessboard squares have different colors.");
        }
    }

    public static boolean isSameColor(int x, int y, int x1, int y1) {
        // Check if the sum of coordinates for both squares is even or odd
        boolean isFirstSquareWhite = (x + y) % 2 == 0;
        boolean isSecondSquareWhite = (x1 + y1) % 2 == 0;

        // Return true if both squares have the same color
        return isFirstSquareWhite == isSecondSquareWhite;
    }


}
