package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class DayMonthModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        if ((x < 0 ) && (y < 0))
            System.out.println("Неправильное значение месяца и дня");
        else if (x < 0)
            System.out.println("Неправильное значение месяца");
        else if (y < 0)
            System.out.println("Неправильное значение дня");
        else {
            if (x % 12 == 1) {
                System.out.print("Январь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 2) {
                System.out.print("Февраль - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 3) {
                System.out.print("Март - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 4) {
                System.out.print("Апрель - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 5) {
                System.out.print("Май - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 6) {
                System.out.print("Июнь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 7) {
                System.out.print("Июль - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 8) {
                System.out.print("Август - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 9) {
                System.out.print("Сентябрь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 10) {
                System.out.print("Октябрь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 11) {
                System.out.print("Ноябрь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
            if (x % 12 == 12 || x % 12 == 0) {
                System.out.print("Декабрь - ");
                if (y % 7 == 1)
                    System.out.print("понедельник");
                else if (y % 7 == 2)
                    System.out.print("вторник");
                else if (y % 7 == 3)
                    System.out.print("среда");
                else if (y % 7 == 4)
                    System.out.print("четверг");
                else if (y % 7 == 5)
                    System.out.print("пятница");
                else if (y % 7 == 6)
                    System.out.print("суббота");
                else
                    System.out.print("воскресенье");
            }
        }
    }


}
