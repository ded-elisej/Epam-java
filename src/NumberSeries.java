public class NumberSeries {
    /*Найти сумму тех членов ряда, модкль которых >= е*/
    private double a, n, e, summa;

    public static void main(String[] args) {
        double e = 0.1;
        double summa = 0;
        double n = 5;
        for (int i = 1; i <= n; i++){
            double a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if (Math.abs(a) >= e){
                summa = summa + a;
            }
        }
        System.out.println("Сумма членов ряда равна " +summa);
    }
}
