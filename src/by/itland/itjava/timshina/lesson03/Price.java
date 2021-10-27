package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int a = (int) x;
        double b = (x - a) * 100;
        //System.out.printf("%d рублей %.0f копеек", a, b);
        if (a == 1) {
            if ((b % 10 > 0.8) && (b % 10 < 2)) {
                System.out.printf("%d рубль %.0f копейка", a, b);
            } else if ((b % 10 >= 2) && (b % 10 < 5)) {
                System.out.printf("%d рубль %.0f копейки", a, b);
            } else
                System.out.printf("%d рубль %.0f копеек", a, b);
        } else if ((a % 10 > 1) && (a % 10 < 5)) {
            if ((b % 10 > 0.8) && (b % 10 < 2)) {
                System.out.printf("%d рубля %.0f копейка", a, b);
            } else if ((b % 10 >= 2) && (b % 10 < 5)) {
                System.out.printf("%d рубля %.0f копейки", a, b);
            } else
                System.out.printf("%d рубля %.0f копеек", a, b);
        } else if ((a % 10 > 4)) {
            if ((b % 10 > 0.8) && (b % 10 < 2)) {
                System.out.printf("%d рублей %.0f копейка", a, b);
            } else if ((b % 10 >= 2) && (b % 10 < 5)) {

                System.out.printf("%d рублей %.0f копейки", a, b);
            } else {

                System.out.printf("%d рублей %.0f копеек", a, b);
            }
        }

    }
}
