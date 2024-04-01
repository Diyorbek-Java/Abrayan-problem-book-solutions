package forSlotions;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given integers K and N (N > 0), output the number K N times");
        System.out.print("Enter the number K: ");
        int k = scanner.nextInt();
        System.out.print("Enter the number N: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(k);
        }
    }
}
