package by.itland.itjava.drobyazko;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double res = Math.pow(x, 2) / (4 * Math.PI);
        System.out.printf(Locale.ENGLISH, "Площадь круга:  %.3f. Длина окружности: %.1f ", res, x);

    }
}
