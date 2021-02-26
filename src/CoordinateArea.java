public class CoordinateArea {
    private float X,Y;

    public static void main(String[] args) {
        float x = 2;
        float y = 4;
        if (x>=-4 & x<=4 & y>=-3 & y<=0 || x>=2 & x<=2 & y>=0 & y<=4){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public float getX() {
        return this.X;
    }

    public float getY() {
        return this.Y;
    }

    public void setX(float x) {
        this.X = x;
    }

    public void setY(float y) {
        this.Y = y;
    }
}
