package Task_2_Arrays;

public class CountingElements {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5};
        int kminus = 0;
        int kplus = 0;
        int kzero = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                kplus ++;
            }
            else {
                if (array[i] < 0){
                    kminus ++;
                }
                else kzero ++;
            }
        }
        System.out.println("Количество отрицательных элементов равно " +kminus+ ", колчество положительных элементов " +
                "равно " +kplus+ ", колчество нулевых - " +kzero);
    }
}
