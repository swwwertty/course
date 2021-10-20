package by.itland.itjava.drobyazko;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    double res = x - 10 * Math.sin(x) + Math.abs(Math.pow(x, 4)-Math.pow(x, 5));
    System.out.println(res);
    }
}
