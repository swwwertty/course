package by.itland.itjava.kovalevskaya;

import java.util.Scanner;

public class Example2 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double result = Math.pow(x, 2) - 7* x + 10 / (Math.pow(x,2) - 8 * x + 10);
        System.out.println(result);
    }
}
