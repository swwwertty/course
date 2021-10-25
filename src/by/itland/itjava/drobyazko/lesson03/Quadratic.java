package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D>=0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("x1=%.2f; x2=%.2f", x1, x2);
        }
        else
            System.out.println("Уравнение не имеет корней");

    }
}
