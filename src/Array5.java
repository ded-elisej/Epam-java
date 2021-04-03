package Task_2_Arrays;

public class Array5 {
    public static void main(String[] args) {
        int [] array = {0, 1, 8, 3, 4, 8};
        for (int i = 0; i < array.length; i++){
            if (array[i] > i)
                System.out.println(array[i]);
        }
    }
}
