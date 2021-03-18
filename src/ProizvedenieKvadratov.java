public class ProizvedenieKvadratov {
    /*Программа нахождения произведения квадратов первых двухсот чисел*/
    int p;

    public static void main(String[] args) {
        int p = 1;
        for (int i = 1; i <= 200; i++){
            p = i * i;
            p = p * p;
        }
        System.out.println("Произведение равно " +p);
    }
}
