package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x < 1 || x >= 13) && (y < 1 || y > 7))
            System.out.println("Неправильное значение месяца и дня");
        else if(x < 1 || x > 12)
            System.out.println("Неправильное значение месяца");
        else if(y < 1 || y > 7)
            System.out.println("Неправильное значение дня");
        else {
            if (x == 1) {
                System.out.print("Январь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 2) {
                System.out.print("Февраль - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 3) {
                System.out.print("Март - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 4) {
                System.out.print("Апрель - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 5) {
                System.out.print("Май - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 6) {
                System.out.print("Июнь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 7) {
                System.out.print("Июль - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 8) {
                System.out.print("Август - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 9) {
                System.out.print("Сентябрь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 10) {
                System.out.print("Октябрь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 11) {
                System.out.print("Ноябрь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x == 12) {
                System.out.print("Декабрь - ");
                if (y == 1)
                    System.out.print("понедельник");
                else if (y == 2)
                    System.out.print("вторник");
                else if (y == 3)
                    System.out.print("среда");
                else if (y == 4)
                    System.out.print("четверг");
                else if (y == 5)
                    System.out.print("пятница");
                else if (y == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
        }
    }
}