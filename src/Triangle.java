public class Triangle {
    private int alfa;
    private int beta;

    public static void main(String[] args) {
        int alfa = 300;
        int beta = 60;
        int gama = 180 - alfa - beta;
        if (gama > 0){
            System.out.println("Треугольник существует. ");
        }
        else{
            System.out.println("Треугольник не существует. ");
        }
        if (alfa == 90 || beta == 90 || gama == 90){
            System.out.println("Треугольник прямоугольный. ");
        }
        else {
            System.out.println("Треугольник не прямоугольный. ");
        }
    }
}
