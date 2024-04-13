package SeriesSolutions;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
               An integer K and a sequence of nonzero integers terminated by zero are given (the final zero is not an element of the sequence). Output the order number of the first element whose value greater than K.
               If the sequence does not contain the required elements then output 0.
               """);
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        System.out.println("Enter the sequence of nonzero integers terminated by zero:");
        int orderNumber = 0;
        boolean found = false;
        while (true) {
            int num = scanner.nextInt();
            orderNumber++;
            if (num == 0) {
                break;
            }
            if (num > K) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Order number of the first element greater than " + K + ": " + orderNumber);
        } else {
            System.out.println("0");
        }
        scanner.close();
    }

}
