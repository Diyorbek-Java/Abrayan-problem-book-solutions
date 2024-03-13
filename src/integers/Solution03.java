package integers;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application turns byte size into K bytes");
        System.out.print("Insert size of the application of the file in byte :");
        double byteSize = scanner.nextDouble();
        double kByteSize = Double.parseDouble(String.format("%.2f", byteSize / 1024));
        System.out.printf("So the %s bytes equal to %s KBytes", byteSize, kByteSize);
    }
}
