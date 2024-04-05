package whileSolutions;


import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) is given. If it equals 3 raised to some integer power then output True,
                otherwise output False.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        while (n != 3) {
            n = scanner.nextInt();
            System.out.println("False, Enter number N: ");
        }
        System.out.println("True, number is equal to 3");
        scanner.close();

    }
}
