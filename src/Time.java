public class Time {
    private int T;

    public static void main(String[] args) {
        int t = 4810;
        int hour = t/3600;
        int min = (t/60) - (hour*60);
        int sec = t - (hour*3600) - (min*60);
        System.out.println(hour+" ч "+min+" мин "+sec+" с ");

    }

    public int getT() {
        return this.T;
    }

    public void setT(int t) {
        this.T = t;
    }
}
