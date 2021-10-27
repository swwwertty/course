package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if  (x == z && x == y && z == y)
            System.out.println(x + " " + z + " " + y);
        else if (y == x)
            System.out.println(x + " " + y);
        else if (x == z)
            System.out.println(x + " " + z);
        else if (z == y)
            System.out.println( z + " " + y);
        else
            System.out.println("Одинаковых чисел нет");
    }
}
