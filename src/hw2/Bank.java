package hw2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите сумму вклада в банк в гривнах, процент годовых," +
                " длитильность вклада(лет)");
        double sumInvest = scanner1.nextDouble();
        double percent = scanner1.nextDouble();
        int term = scanner2.nextInt();

        double sum = sumInvest;

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            System.out.println("Накопленная сумма за" + i + "год составила: " + sum);
            System.out.println("Начисленные проценты в грн: " + y);
        }
    }

}
