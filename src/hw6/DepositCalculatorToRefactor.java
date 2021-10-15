package hw6;

import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            if(i%10 == 1 && i/10%10 != 1 ) {
                System.out.printf("Накопленная сумма за " + i + " год составила: %.2f грн\n", sum);
            }else if((i%10 == 2 || i%10 == 3 || i%10 == 4) && i/10%10 != 1){
                System.out.printf("Накопленная сумма за " + i + " года составила: %.2f грн\n", sum);
            }else{
                System.out.printf("Накопленная сумма за " + i + " лет составила: %.2f грн\n", sum);
            }
            System.out.printf("Начисленные проценты в грн: %.2f\n", y);
            System.out.println("-------");
        }
    }

}
