package by.itland.itjava.timshina.lesson03;

import java.util.Locale;
import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.printf(Locale.ENGLISH, "%.1f", (double) x);
    }
}
