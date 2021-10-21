package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;
//abcd//
//1432//

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x / 1000;
        int b = x / 100 % 10;
        int c = x / 10 % 10;
        int d = x % 10;
        if (x >= 1000 && x < 10000)
            System.out.println(a + b + c + d);
        else if (x <= -1000 && x > -10000)
            System.out.println("-" + (a + b + c + d));
        else
            System.out.println("Число не четырехзначное");


    }
}
