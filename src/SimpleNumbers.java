package Task_2_Arrays;

public class SimpleNumbers {
    //если предположить, что в задании имелись в виду цифры
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 7, 0, 11, 80, 1, 22, 13, 14, 15};
        int summa = 0;
        for (int i = 0; i < array.length; i++){
            if (i > 0 & i < 10)
                summa += array[i];
        }
        System.out.println("Сумма элементов массива с простым порядковым номером равна " + summa);
    }
}
