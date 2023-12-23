public class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        setX(x);
        setY(y);
    }
    public double distanceTo(double A,double B){
        return Math.sqrt((Math.pow(this.x-A,2))+(Math.pow(this.y-B,2)));
    }
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public String toString(){
        return "X =" + this.getX() + "Y =" + this.getY();

    }
}
