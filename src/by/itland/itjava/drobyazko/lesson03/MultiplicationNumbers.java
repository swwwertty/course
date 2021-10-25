package by.itland.itjava.drobyazko.lesson03;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0){
            int d = a * b;
            System.out.printf(Locale.forLanguageTag("ru"), "%d умножить на %d равно %d", a, b, d);
        }else
            System.out.println("нужно вводить толко цифры, т.е. значения от 0 до 10");


    }
}
