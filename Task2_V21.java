import java.util.Scanner;

public class Task2_V21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = sc.nextDouble();
        System.out.print("Введите b: ");
        double b = sc.nextDouble();
        System.out.print("Введите x: ");
        double x = sc.nextDouble();

        double f;

        if (x > -8 && x < 3) {
            f = Math.sqrt(a * x - 3);
        } else if (x == 3) {
            f = x * x - b * x + 7;
        } else if (x > 3) {
            f = Math.cos(x + 1);
        } else {
            System.out.println("x не входит в допустимый диапазон.");
            sc.close();
            return;
        }

        System.out.printf("Task2_V21:%n");
        System.out.printf("a = %.3f, b = %.3f, x = %.3f%n", a, b, x);
        System.out.printf("f(x) = %.10f%n", f);

        sc.close();
    }
}
