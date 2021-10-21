package by.itland.itjava.timshina.lesson02;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        float sqr = (float) (x*Math.sqrt(3)/2);
        float h = (float) (Math.pow(x, 2)*Math.sqrt(3)/4);
        float r = (float) (x*Math.sqrt(3)/6);
        float R = (float) (x*Math.sqrt(3)/3);

        System.out.printf("Треугольник со стороной %.3f имеет:\n Высоту %.3f\n площадь %.3f\n радиус вписанной окружности %.3f\nрадиус описанной окружности %.3f", x, sqr, h, r, R);
    }
}
