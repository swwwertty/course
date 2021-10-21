package by.itland.itjava.drobyazko.lesson02;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float h = (float) (Math.sqrt(3) * a / 2);
        float S = (float) (Math.sqrt(3) * Math.pow(a, 2)/4);
        float R = (float) (a / Math.sqrt(3));
        float r = (float) (a / (2 * Math.sqrt(3) ));
        System.out.printf( "Треугольник со стороной %.3f имеет:\n" +
                " Высоту %.3f\n" +
                " площадь %.3f\n" +
                " радиус вписанной окружности %.3f\n" +
                "радиус описанной окружности %.3f\n ", a, h, S, r, R);


    }


}
