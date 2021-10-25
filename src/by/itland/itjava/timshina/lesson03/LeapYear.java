package by.itland.itjava.timshina.lesson03;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 1)
            System.out.println("Год не может быть отрицательным");
        else if ((x % 100 == 0) && (x % 400 != 0))
            System.out.println("Невисокосный");
        else if (x % 4 == 0)
            System.out.println("Високосный");
        else
            System.out.println("Невисокосный");
    }
}
