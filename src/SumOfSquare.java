public class SumOfSquare {
   private int s;

    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++){
            s = s + i*i;
        }
        System.out.println("Сумма квадратов чисел равна " +s);
    }
}
