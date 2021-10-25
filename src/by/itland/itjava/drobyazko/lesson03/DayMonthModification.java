package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class DayMonthModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //месяц//
        int b = scanner.nextInt(); //день//
        if (a < 0 && b < 0)
            System.out.println("Неправильное значение месяца и дня");
        else if (a < 0 )
            System.out.println("Неправильное значение месяца");
        else if (b <0)
            System.out.println("Неправильное значение дня");
        else{
            if (a %12== 1)
                System.out.print("Январь - ");
            else if (a%12 == 2)
                System.out.print("Февраль - ");
            else if (a%12 == 3)
                System.out.print("Март - ");
            else if (a%12 == 4)
                System.out.print("Апрель - ");
            else if (a %12== 5)
                System.out.print("Май - ");
            else if (a%12 == 6)
                System.out.print("Июнь - ");
            else if (a%12 == 7)
                System.out.print("Июль - ");
            else if (a%12 == 8)
                System.out.print("Август - ");
            else if (a%12 == 9)
                System.out.print("Сентябрь - ");
            else if (a%12 == 10)
                System.out.print("Октябрь - ");
            else if (a%12 == 11)
                System.out.print("Ноябрь - ");
            else
                System.out.print("Декабрь - ");
            if (b %7 == 1)
                System.out.print("понедельник");
            else if (b%7 == 2)
                System.out.print("вторник");
            else if (b %7== 3)
                System.out.print("среда");
            else if (b %7== 4)
                System.out.print("четверг");
            else if (b%7 == 5)
                System.out.print("пятница");
            else if (b %7== 6)
                System.out.print("суббота");
            else
                System.out.print("воскресенье");
        }

    }
}
