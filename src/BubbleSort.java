package Task_2_Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5, 4, 4, 3, 2, 1};
        int temp; //переменная для временного хранения
        int numberOfPermutation = 0; //переменная для подсчёта перестановок
        int i = 0;
        while (true) {
            if (array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                numberOfPermutation = 0;
            }
            else {
                numberOfPermutation++;
            }
            i++;
            if (i == array.length - 1){
                i = 0;
            }
            if (numberOfPermutation == array.length - 1)
                break;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(numberOfPermutation);
    }
}
