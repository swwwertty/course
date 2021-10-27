package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 9 || b > 9 || a < 0 || b < 0)
            System.out.println("нужно вводить только цифры, т.е. значения от 0 до 10");
        else if ((a < 10 && a > -1) && (b < 10 && b > -1)) {
            if (a == 1) {
                if (b == 1) {
                    System.out.println("один умножить на один равно один");
                } else if (b == 2) {
                    System.out.println("один умножить на два равно два");
                } else if (b == 3) {
                    System.out.println("один умножить на три равно три");
                } else if (b == 4) {
                    System.out.println("один умножить на четыре равно четыре");
                } else if (b == 5) {
                    System.out.println("один умножить на пять равно пять");
                } else if (b == 6) {
                    System.out.println("один умножить на шесть равно шесть");
                } else if (b == 7) {
                    System.out.println("один умножить на семь равно семь");
                } else if (b == 8) {
                    System.out.println("один умножить на восемь равно восемь");
                } else if (b == 9) {
                    System.out.println("один умножить на девять равно девять");
                } else {
                    System.out.println("один умножить на ноль равно ноль");
                }
            }
            if (a == 0) {
                if (b == 1) {
                    System.out.println("ноль умножить на один равно ноль");
                } else if (b == 2) {
                    System.out.println("ноль умножить на два равно ноль");
                } else if (b == 3) {
                    System.out.println("ноль умножить на три равно ноль");
                } else if (b == 4) {
                    System.out.println("ноль умножить на четыре равно ноль");
                } else if (b == 5) {
                    System.out.println("ноль умножить на пять равно ноль");
                } else if (b == 6) {
                    System.out.println("ноль умножить на шесть равно ноль");
                } else if (b == 7) {
                    System.out.println("ноль умножить на семь равно ноль");
                } else if (b == 8) {
                    System.out.println("ноль умножить на восемь равно ноль");
                } else if (b == 9) {
                    System.out.println("ноль умножить на девять равно ноль");
                } else {
                    System.out.println("ноль умножить на ноль равно ноль");
                }
            }
            if (a == 2) {
                if (b == 1) {
                    System.out.println("два умножить на один равно два");
                } else if (b == 2) {
                    System.out.println("два умножить на два равно четыре");
                } else if (b == 3) {
                    System.out.println("два умножить на три равно шесть");
                } else if (b == 4) {
                    System.out.println("два умножить на четыре равно восемь");
                } else if (b == 5) {
                    System.out.println("два умножить на пять равно десять");
                } else if (b == 6) {
                    System.out.println("два умножить на шесть равно двенадцать");
                } else if (b == 7) {
                    System.out.println("два умножить на семь равно четырнадцать");
                } else if (b == 8) {
                    System.out.println("два умножить на восемь равно шестнадцать");
                } else if (b == 9) {
                    System.out.println("два умножить на девять равно восемнадцать");
                } else {
                    System.out.println("два умножить на ноль равно ноль");
                }
            }
            if (a == 3) {
                if (b == 1) {
                    System.out.println("три умножить на один равно три");
                } else if (b == 2) {
                    System.out.println("три умножить на два равно шесть");
                } else if (b == 3) {
                    System.out.println("три умножить на три равно девять");
                } else if (b == 4) {
                    System.out.println("три умножить на четыре равно двенадцать");
                } else if (b == 5) {
                    System.out.println("три умножить на пять равно пятнадцать");
                } else if (b == 6) {
                    System.out.println("три умножить на шесть равно восемнадцать");
                } else if (b == 7) {
                    System.out.println("три умножить на семь равно двадцать один");
                } else if (b == 8) {
                    System.out.println("три умножить на восемь равно двадцать четыре");
                } else if (b == 9) {
                    System.out.println("три умножить на девять равно двадцать семь");
                } else {
                    System.out.println("три умножить на ноль равно ноль");
                }
            }
            if (a == 4) {
                if (b == 1) {
                    System.out.println("четыре умножить на один равно четыре");
                } else if (b == 2) {
                    System.out.println("четыре умножить на два равно восемь");
                } else if (b == 3) {
                    System.out.println("четыре умножить на три равно двенадцать");
                } else if (b == 4) {
                    System.out.println("четыре умножить на четыре равно шестнадцать");
                } else if (b == 5) {
                    System.out.println("четыре умножить на пять равно двадцать");
                } else if (b == 6) {
                    System.out.println("четыре умножить на шесть равно двадцать четыре");
                } else if (b == 7) {
                    System.out.println("четыре умножить на семь равно двадцать восемь");
                } else if (b == 8) {
                    System.out.println("четыре умножить на восемь равно двадцать тридцать два");
                } else if (b == 9) {
                    System.out.println("четыре умножить на девять равно двадцать тридцать шесть");
                } else {
                    System.out.println("четыре умножить на ноль равно ноль");
                }
            }
            if (a == 5) {
                if (b == 1) {
                    System.out.println("пять умножить на один равно пять");
                } else if (b == 2) {
                    System.out.println("пять умножить на два равно десять");
                } else if (b == 3) {
                    System.out.println("пять умножить на три равно пятнадцать");
                } else if (b == 4) {
                    System.out.println("пять умножить на четыре равно двадцать");
                } else if (b == 5) {
                    System.out.println("пять умножить на пять равно двадцать пять");
                } else if (b == 6) {
                    System.out.println("пять умножить на шесть равно тридцать");
                } else if (b == 7) {
                    System.out.println("пять умножить на семь равно тридцать пять");
                } else if (b == 8) {
                    System.out.println("пять умножить на восемь равно сорок");
                } else if (b == 9) {
                    System.out.println("пять умножить на девять равно сорок пять");
                } else {
                    System.out.println("пять умножить на ноль равно ноль");
                }
            }
            if (a == 6) {
                if (b == 1) {
                    System.out.println("шесть умножить на один равно шесть");
                } else if (b == 2) {
                    System.out.println("шесть умножить на два равно двенадцать");
                } else if (b == 3) {
                    System.out.println("шесть умножить на три равно восемнадцать");
                } else if (b == 4) {
                    System.out.println("шесть умножить на четыре равно двадцать четыре");
                } else if (b == 5) {
                    System.out.println("шесть умножить на пять равно тридцать");
                } else if (b == 6) {
                    System.out.println("шесть умножить на шесть равно тридцать шесть");
                } else if (b == 7) {
                    System.out.println("шесть умножить на семь равно сорок два");
                } else if (b == 8) {
                    System.out.println("шесть умножить на восемь равно сорок восемь");
                } else if (b == 9) {
                    System.out.println("шесть умножить на девять равно пятьдесят четыре");
                } else {
                    System.out.println("шесть умножить на ноль равно ноль");
                }
            }
            if (a == 7) {
                if (b == 1) {
                    System.out.println("семь умножить на один равно семь");
                } else if (b == 2) {
                    System.out.println("семь умножить на два равно четырнадцать");
                } else if (b == 3) {
                    System.out.println("семь умножить на три равно двадцать один");
                } else if (b == 4) {
                    System.out.println("семь умножить на четыре равно двадцать восемь");
                } else if (b == 5) {
                    System.out.println("семь умножить на пять равно тридцать пять");
                } else if (b == 6) {
                    System.out.println("семь умножить на шесть равно сорок два");
                } else if (b == 7) {
                    System.out.println("семь умножить на семь равно сорок девять");
                } else if (b == 8) {
                    System.out.println("семь умножить на восемь равно пятьдесят шесть");
                } else if (b == 9) {
                    System.out.println("семь умножить на девять равно шестьдесят четыре");
                } else {
                    System.out.println("семь умножить на ноль равно ноль");
                }
            }
            if (a == 8) {
                if (b == 1) {
                    System.out.println("восемь умножить на один равно восемь");
                } else if (b == 2) {
                    System.out.println("восемь умножить на два равно шестнадцать");
                } else if (b == 3) {
                    System.out.println("восемь умножить на три равно двадцать четыре");
                } else if (b == 4) {
                    System.out.println("восемь умножить на четыре равно тридцать два");
                } else if (b == 5) {
                    System.out.println("восемь умножить на пять равно сорок");
                } else if (b == 6) {
                    System.out.println("восемь умножить на шесть равно сорок восемь");
                } else if (b == 7) {
                    System.out.println("восемь умножить на семь равно пятьдесят шесть");
                } else if (b == 8) {
                    System.out.println("восемь умножить на восемь равно шестьдесят четыре");
                } else if (b == 9) {
                    System.out.println("восемь умножить на девять равно семьдесят два");
                } else {
                    System.out.println("восемь умножить на ноль равно ноль");
                }
            }
            if (a == 9) {
                if (b == 1) {
                    System.out.println("девять умножить на один равно девять");
                } else if (b == 2) {
                    System.out.println("девять умножить на два равно восемнадцать");
                } else if (b == 3) {
                    System.out.println("девять умножить на три равно двадцать семь");
                } else if (b == 4) {
                    System.out.println("девять умножить на четыре равно тридцать шесть");
                } else if (b == 5) {
                    System.out.println("девять умножить на пять равно сорок пять");
                } else if (b == 6) {
                    System.out.println("девять умножить на шесть равно пятьдесят четыре");
                } else if (b == 7) {
                    System.out.println("девять умножить на семь равно шестьдесят три");
                } else if (b == 8) {
                    System.out.println("девять умножить на восемь равно семьдесят два");
                } else if (b == 9) {
                    System.out.println("девять умножить на девять равно восемдесят один");
                } else {
                    System.out.println("девять умножить на ноль равно ноль");
                }
            }
        }
    }
}