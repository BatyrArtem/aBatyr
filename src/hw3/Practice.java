package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------");

        int n = 6;
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
        System.out.println("-----------");

        sum = 1;
        while (n != 0) {
            sum = sum * n;
            n--;
        }
        System.out.println(sum);
        System.out.println("-----------");

        sum = 1;
        n = 6;
        do {
            sum = sum * n;
            n--;
        }
        while (n != 0);
        System.out.println(sum);
        System.out.println("-----------");

        double x = 6;
        n = 7;
        System.out.println((int)Math.pow(x,n));
        System.out.println("-----------");

        for (int i = 0; i > -50; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------");

        System.out.println("Введите число для таблицы умножения");
        Scanner scanner1 = new Scanner(System.in);
        int multiplication = scanner1.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i * multiplication + " ");
        }
        System.out.println();
        System.out.println("-----------");

        for (int i = 1; i < 20; i += 2) {
            if(i != 19) {
                System.out.print(i + ",");
            }
            else System.out.println(i);
        }
        System.out.println("-----------");

        int[] m = {1, -1, -1, 4, 2};
        int min = m[0];
        int check = 1;
        for (int i = 0; i < 5; ++i) {
            if (m[i] <= min) {
                if (m[i] < min) {
                    check = 1;
                    min = m[i];
                } else if (m[i] == min) {
                    check++;
                    min = m[i];
                }
            }
        }
        for (int i = 0; i < check; i++) {
            System.out.print(min + " ");
        }
        System.out.println();
        System.out.println("-----------");

        int max = m[0];
        for (int i = 0; i < 5; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.println(max);

        int[] arr = {4, -5, 0, 6, 8};
        int max1 = m[0];
        int area1 = 0;
        for (int i = 0; i < 5; i++) {
            if (m[i] > max1) {
                max1 = m[i];
                area1 = i;
            }
        }

        int min2 = m[0];
        int area2 = 0;
        for (int i = 0; i < 5; i++) {
            if (m[i] < max1) {
                max1 = m[i];
                area2 = i;
            }
        }

        int xranenie = arr[area1];
        arr[area1] = arr[area2];
        arr[area2] = xranenie;
        for (int u : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("-----------");


        int p = 0;
        for (int r : arr) {
            p += x;
        }
        System.out.println((double) p / (double) arr.length);

        System.out.println("-----------");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0)) {
                    System.out.print("W ");
                } else System.out.print("B ");

            }
            System.out.println();

        }
    }
}
