package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0)
            System.out.println("Число положительное");
        else if (x == 0)
            System.out.println("Число ноль");
        else
            System.out.println("Число отрицательное");
    }
}
