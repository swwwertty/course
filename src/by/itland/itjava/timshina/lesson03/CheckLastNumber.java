package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class CheckLastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int k = scanner.nextInt();

        double l = Math.abs(n) % 10;
        if (k > 0 && k < 10) {
            if (k == l)
                System.out.printf("Цифра %d является последней числа %.0f", k, n);
            else if (k != l)
                System.out.printf("Цифра %d не является последней числа %.0f", k, n);
        }
        else
            System.out.printf("Число к не может быть отрицательным и больше 9");

    }
}
