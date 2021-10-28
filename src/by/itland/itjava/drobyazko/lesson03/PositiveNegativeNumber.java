package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 0)
            System.out.println("Число отрицательное");
        else if (i>0)
            System.out.println("Число положительное");
        else
            System.out.println("Число ноль");

    }
}
