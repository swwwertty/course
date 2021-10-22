package by.itland.itjava.davydovskikh;
    import java.util.Scanner;

    public class QuadraticEquation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            double D = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Уравнение %dx^2+%dx+%d имеет корни x1=%.2f x2=%.2f", a, b, c, x1, x2);
        }
}
