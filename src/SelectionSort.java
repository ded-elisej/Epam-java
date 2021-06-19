package Task_2_Arrays;

import java.util.Arrays;

public class SelectionSort { //сортировка выбором
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 5, 1}; //ввод массива
        for (int i = 0; i < array.length - 1; i++) { //проходимся по массиву
            int position = i; //индекс рабочего элемента массива
            for (int j = i + 1; j < array.length; j++) { //проходимся по элементам, начиная со второго
                if (array[j] < array[position]) { //сравнение элемента неотсортированного массива с рабочим элементом
                    position = j; //нашли элемент, меньше рабочего. Он и становится рабочим
                }
            }
            //замена местами (swap?)
            int temp = array[position]; //временная переменная приравнивается к рабочему элементу
            array[position] = array[i]; //заменяем рабочий элемент элеметом, с которым мы сравнивали
            array[i] = temp; //возвращаем на место элемента, которым мы сравнивали, ставим рабочий.
            //теперь он в отсортированной части массива. Следующая итерация в цикле будет i+1 (соответственно)
        }
        System.out.println(Arrays.toString(array)); //вывод массива в строку с помощью java.util.Arrays
    }
}
