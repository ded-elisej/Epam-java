package Task_2_Arrays;

public class SomeColums_2_3 {
    /*
    Дана матрица. Вывести к-ю строку и р-й столбцы матрицы
     */
    public static void main(String[] args) {
        int [][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int p = 0;
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j< matrice[i].length; j++){
                System.out.println(matrice[k][j] + " ");
            }
            System.out.println();
            break;
        }
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j< matrice[i].length; j++) {
                System.out.println(matrice[i][p] + " ");
            }
            System.out.println();
            break;
    }
    }
}
