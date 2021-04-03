package Task_2_Arrays;

public class ReplacementMinMax {
    public static void main(String[] args) {
        int [] array = {0, 1, 8, 4, 2};
        int max = 0;
        int min = 0;
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        array[imin] = max;
        array[imax] = min;
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}

