package by.itland.itjava.kovalevskaya.lesson04;

import java.util.Scanner;

public class NumberDayYear {

    public static void  main(String[] args){

            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();
            String month = scanner.next();
            int year = scanner.nextInt();
            if (checkMontn(month)) {
                if (LeapYearwithMethod.leapYear(Math.abs(year)).equals("Високосный")) {
                    System.out.println(NumberDayLeapYear.getNumberDay(Math.abs(day), month));
                } else {
                    System.out.println(NumberDayNoLeapYear.getNumberDay(Math.abs(day), month));

                }
            }

        }

    private static boolean checkMontn(String month) {
        switch (month) {
            case "январь":
            case "февраль":
            case "март":
            case "апрель":
            case "май":
            case "июнь":
            case "июль":
            case "август":
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
            case "декабрь": return true;
            default: return false;
    }
}
}
