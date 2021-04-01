package Task_2_Arrays;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int k = 2;
        int summa = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % k == 0) {
                summa += array[i];           }
        }
        System.out.println("Сумма чисел, кратных " + k + " равна " + summa);
    }
}
