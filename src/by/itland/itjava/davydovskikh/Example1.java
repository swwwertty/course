package by.itland.itjava.davydovskikh;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double result = Math.pow(3, -x) - Math.cos(x) + Math.sin(2*x*y);
        System.out.println(result);
    }
}
