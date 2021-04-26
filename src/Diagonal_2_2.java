package Task_2_Arrays;

public class Diagonal_2_2 {
    /*
    Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали
     */
    public static void main(String[] args) {
        int [][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //add new massive
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; i<matrice[i].length; j++){
                if (i == j){ //diagonal condition
                    System.out.print( matrice[i][j] + " ");//array output
                    break;
                }
            }
        }
    }
}
