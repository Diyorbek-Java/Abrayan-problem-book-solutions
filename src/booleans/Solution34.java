package booleans;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So the solution for checking coordinates (X,Y) is white square in chess board ");
        System.out.println("Please Enter coordinate x: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinates y:  ");
        int y = scanner.nextInt();
        if (isWhiteSquare(x, y)) {
            System.out.printf("The chessboard square (%d, %d) is white.", x, y);
        } else {
            System.out.printf("The chessboard square (%d, %d) is black.", x, y);
        }
    }

    public static boolean isWhiteSquare(int x, int y) {
        // The square is white if the sum of x and y is even
        return (x + y) % 2 == 0;
    }


}
