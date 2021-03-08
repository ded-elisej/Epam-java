import java.util.Scanner;

public class SumOfNum {
    int a, summa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i <= a; i++){
            System.out.println(((1 + a) / 2 ) * a);
            break;
        }
    }
}
