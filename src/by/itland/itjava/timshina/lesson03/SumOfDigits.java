package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = Math.abs(x) % 10;
        int b = Math.abs(x) / 1000;
        int c = Math.abs(x) % 100 / 10;
        int d = Math.abs(x) / 100 % 10;
        int res = 0;
        // System.out.printf("%d, %d, %d, %d, %d", x, b, d, c, a);
        if ((x > 999 && x < 10000) )
            System.out.println(a + b + c + d);
        else if (x > -10000 && x < -999) {
            res = (a + b + c + d);
            System.out.println(res * (-1));
        }
        else
             System.out.println("Число не четырехзначное");


    }
}
