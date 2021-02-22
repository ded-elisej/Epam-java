import static java.lang.Math.*;

public class Sin{
    public static void main(String[] args) {
        double x = 3;
        double y = 1;
        double function = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Значение выражения = " +function);
    }
}

