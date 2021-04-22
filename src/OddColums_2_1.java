package Task_2_Arrays;

public class OddColums_2_1 {
    /*
    дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего
     */
    public static void main(String[] args) {
        int [][] matrice = {{8, 2, 6}, {5, 4, 4}, {6, 6, 5}}; // ввод массива

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j = j + 2) { //перебор только нечётных столбцов
                if (matrice[0][j] > matrice[matrice.length-1][j]) //условие для первого элемента
                System.out.print( matrice[i][j] + " "); //вывод массива в виде матрицы
            }
            System.out.println();
        }
        }
    }
