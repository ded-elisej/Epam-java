package Task_2_Arrays;

public class GoOutSecondElements_10 {
    /*
    Дан целочисленный массив с колличеством элементов n. Сжать массив, выбросив из него каждый второй элемент
     (освободившиеся элементы заполнить нулями)
     */
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 1; i < array.length; i = i + 2){
            array[i] = 0;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
