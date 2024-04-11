package whileSolutions;


import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real number A (> 1) is given. Find the largest integer
                K such that the sum 1 + 1/2 + … + 1/K is less than A. Output K and the corresponding sum.
                """);
        System.out.print("Enter number A: ");
        int a = scanner.nextInt();
        int sum = 0;
        int k = 1;
        while (sum <= a) {
            sum += 1 / k;
            k++;
        }
        k--;
        System.out.println("the largest integer K such");
        System.out.printf("that the sum 1 + 1/2 + … + 1/K is less than A = %d. K is %d and the sum %d", a, k, sum);

        scanner.close();
    }
}
