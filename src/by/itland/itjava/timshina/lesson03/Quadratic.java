package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b, 2) - a * 4 * c;
        double x1 = 0;
        double x2 = 0;

        if (d > -1) {
            x1 = ((-1) * b + Math.sqrt(d)) / 2;
            x2 = ((-1) * b - Math.sqrt(d)) / 2;
            System.out.printf("x1=%.2f; x2=%.2f", x1, x2);
        }
        else
            System.out.println("Уравнение не имеет корней");

    }
}
