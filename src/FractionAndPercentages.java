public class FractionAndPercentages {
    public static void main(String[] args) {
        double r = 123.457;
        double b = (r * 1000) % 1000 + (int)r / 1000.0;
        System.out.println("Результатом будет "+b);
    }
}
