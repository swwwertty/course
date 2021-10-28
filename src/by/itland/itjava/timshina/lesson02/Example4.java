package by.itland.itjava.timshina.lesson02;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double res = x-Math.pow(10,Math.sin(x))+Math.cos(x-y);
        System.out.println(res);
    }
}
