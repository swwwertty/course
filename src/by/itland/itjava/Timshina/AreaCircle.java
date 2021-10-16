package by.itland.itjava.Timshina;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        double res = Math.pow(x/(2*Math.PI), 2)*Math.PI;
        System.out.printf(Locale.ENGLISH, "Площадь круга:  %.3f. Длина окружности: %.1f", res, x);
    }
}
