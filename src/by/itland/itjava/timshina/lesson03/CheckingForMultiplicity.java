package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class CheckingForMultiplicity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n%k==0)
            System.out.printf("Число %d кратное %d", n, k);
        else if (n%k!=0)
            System.out.printf("Число %d некратное %d", n, k);
    }
}
