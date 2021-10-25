package by.itland.itjava.timshina.lesson02;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ax^2 + bx + c = 0. При этом предполагается, что дискриминант будет положительный, а коэффициент
        //a ≠ 0. Вывод корней оформить в формате:
        //«Уравнение {a}x^2+{b}x+c имеет корни x1={x1} x2={x2}»

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double D = Math.pow(b, 2)-4*a*c;
        double x2 = (-b-Math.sqrt(D))/2*a;
        double x1 = (-b+Math.sqrt(D))/2*a;
        System.out.printf("Уравнение %dx^2+%dx+%d имеет корни x1=%.2f x2=%.2f", a, b, c, x1, x2);
    }
}
