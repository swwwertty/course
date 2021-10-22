package by.itland.itjava.Timshina;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        //в котором даны координаты двух точек, на
        //плоскости, найти расстояние между этими точками. Вывод оформить в формате:
        //«Расстояние между тачками A({x1}, {y1}) и B({x2}, {y2}): {расстояние}»
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double res = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        System.out.printf("Расстояние между точками A(%d, %d) и B(%d, %d): %.3f", x1, y1, x2, y2, res);
    }
}
