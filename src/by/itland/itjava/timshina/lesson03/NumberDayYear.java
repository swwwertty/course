package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class NumberDayYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dd = scanner.nextInt();
        int d = Math.abs(dd);
        int mm = scanner.nextInt();
        int m = Math.abs(mm);
        int y = scanner.nextInt();
        int res = 0;
        if (!((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0)))) {
            if (m == 1)
                res = Math.abs(d);
            if (m == 2)
                res = 31 + Math.abs(d);
            if (m == 3)
                res = 28 + 31 + Math.abs(d);
            if (m == 4)
                res = 31 + 28 + 31 + Math.abs(d);
            if (m == 5)
                res = 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 6)
                res = 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 7)
                res = 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 8)
                res = 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 9)
                res = 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 10)
                res = 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 11)
                res = 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 12)
                res = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
        }
        else {
            if (m == 1)
                res = Math.abs(d);
            if (m == 2)
                res = 31 + Math.abs(d);
            if (m == 3)
                res = 29 + 31 + Math.abs(d);
            if (m == 4)
                res = 31 + 28 + 31 + Math.abs(d);
            if (m == 5)
                res = 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 6)
                res = 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 7)
                res = 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 8)
                res = 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 9)
                res = 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 10)
                res = 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 11)
                res = 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
            if (m == 12)
                res = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + Math.abs(d);
        }
        System.out.println(res);
    }
}
