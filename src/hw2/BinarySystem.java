package hw2;

import java.util.Scanner;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        double firstDigit = scanner.nextDouble();
        double secondDigit = scanner.nextDouble();

        System.out.println((firstDigit + secondDigit) / 2);
    }
}
