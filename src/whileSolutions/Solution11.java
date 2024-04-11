package whileSolutions;


import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 1) is given. Find the smallest integer K such that
                the sum 1 + 2 + … + K is greater than or equal to N. Output K and the corresponding sum.
                """);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int k = 1;
        while (sum <= n) {
            sum += k;
            k++;
        }
        System.out.printf("the smallest integer K such that the sum 1 + 2 + … + K" +
                "\n is greater than or equal to N = %d. K is %d", n, k);
        scanner.close();
    }
}
