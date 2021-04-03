package Task_2_Arrays;

public class SequenceWithReplacement {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int number = 3;
        int replacement = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > number) {
                array[i] = number;
                replacement++;
            }
        }
        System.out.println("Число замен равно " + replacement);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
