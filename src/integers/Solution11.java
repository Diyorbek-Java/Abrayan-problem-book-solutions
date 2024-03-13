package integers;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A which must be three-digit,\n Solution finds the Product and Sum Of all Digits ");
        System.out.print("Please enter  : ");
        int a = scanner.nextInt();
        int temp = a;
        int sum = 0;
        int product = 1;
        while (temp / 10 != 0) {
            sum += temp % 10;
            product *= temp % 10;
            temp = temp / 10;
        }
        sum += temp;
        product *= temp;
        System.out.printf("So the number is = %d , Sum of its digits is %d and Product of its digits is %d", a, sum, product);
    }
}
