package by.itland.itjava.Timshina;

import java.util.Scanner;

public class PerimeterSquareTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        double res = (x*y)/2;
        double res2 = x+y+(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
        //System.out.println("Площадь прямоугольного треугольника со сторонами"+" "+x+","+" "+y+":"+" "+res+".");
       // System.out.println("Периметр:"+res2);

        System.out.printf("Площадь прямоугольного треугольника со сторонами %.0f, %.0f: %.3f.%nПериметр: %.3f", x, y, res, res2);


    }
}
