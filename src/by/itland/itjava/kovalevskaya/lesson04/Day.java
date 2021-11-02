package by.itland.itjava.kovalevskaya.lesson04;

import java.util.Scanner;

public class Day {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in):
        int i = scanner.nextInt();
        int b = 3;
        //System.out.println(c):
        System.out.println(b);
        printDay(1);

    }

    public static void printDay(int day) {
        switch (day) {
            case 1:
            System.out.println("понедельник");break;
            case 2:
                System.out.println("вторник");break;
            case 3:
                System.out.println("среда");break;
            case 4:
                System.out.println("четверг");break;
            case 5:
                System.out.println("пятница");break;
            case 6:
                System.out.println("суббота");break;
            case 7:
                System.out.println("воскресенье");break;
            default:
                System.out.println("error");
        }
        //System.out.println(c);
    }

    public static String getNameDay(int day) {
        switch (day) {
            case 1:
                return("понидельник");

            case 2:
                return("вторник");

            case 3:
                return("среда");

            case 4:
                return("четверг");

            case 5:
                return("пятница");

            case 6:
                return("суббота");

            case 7:
                return("воскресенье");

            default:
                return ("error");
        }
    }
}
