package by.itland.itjava.davydovskikh;

import java.util.Scanner;

public class PerimeterSquareTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double P = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
        double S = 0.5 * (a*b);
        System.out.printf("Площадь прямоугольного треугольника со сторонами %d, %d: %.3f.\n" +
                "Периметр: %.3f", a, b, S, P);
    }

}
