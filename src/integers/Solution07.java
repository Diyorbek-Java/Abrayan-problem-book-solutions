package integers;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this Solution User should insert positive number A mus be lager than10 \n and the solution first takes left ten digit then one digit");
        System.out.print("So Please enter digit A :");
        int a = scanner.nextInt();
        int temp = a;
        int sumOfTheDigits = 0;
        int productOfTheDigits = 1;
        while (temp / 10 != 0) {
            sumOfTheDigits += temp % 10;
            productOfTheDigits *= temp % 10;
            temp = temp / 10;
            if (temp < 10) {
                sumOfTheDigits += temp;
                productOfTheDigits *= temp;
            }
        }
        System.out.printf("So the number is A = %d , Sum of its digits is %d , Product Of it digits are = %d", a, sumOfTheDigits, productOfTheDigits);
    }
}
