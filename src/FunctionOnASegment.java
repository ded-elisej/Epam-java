import java.util.Scanner;

public class FunctionOnASegment {
    public static void main(String[] args) {
        double y = 0;
        Scanner scanner1 = new Scanner(System.in);
        double x = scanner1.nextDouble();
        double h = 2;
        int a = -5;
        int b = 10;
        for (int i = a; i <= b; i += h) {
            if (x <= 2) {
                y = x * (-1);
                System.out.println("Аргумент меньше 2. Функция y равна " +y);
                break;
            } else {
                y = x;
                System.out.println("Аргумент больше 2. Функция y равна " +y);
                break;
            }
        }
    }
}
