package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class CheckLastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k < 0 || k > 9)
            System.out.println("Число к не может быть отрицательным и больше 9");
        else if (Math.abs(n)%10 ==k)
            System.out.printf("Цифра %d является последней числа %d", k, n);
        else
            System.out.printf("Цифра %d не является последней числа %d",k,n);

    }
}