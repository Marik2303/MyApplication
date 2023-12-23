import java.util.ArrayList;
public class Shape{
    private int size;
    private ArrayList<Point> points;
    private int buffer = 3;

    public Shape() {
        points = new Point[buffer];
    }
    

    public void AddPoint(Point Add){
        points.add(Add);
    }

    public double calculatePerimeter(){
        double perimeter = 0;

        for (int i = 0; i < - 1 + points.length; i++) {
            perimeter += points.get(i).distanceTo(points.get(i+1).getX(), points.get(i+1).getY());
        }

        return perimeter + points.get(points.size()-1).distanceTo(points.get(0).getX(), points.get(0).getY());
    }

    public double getAverageSide() {
        return this.calculatePerimeter() / this.points.size();
    }

    public double getLongest() {
        double longest = points.get(0).distanceTo(points.get(1).getX(),points.get(1).getY());
        double temp = 0;
        for (int i = 0; i < points.size()-1; i++) {
            temp = points.get(i).distanceTo(points.get(i+1).getX(),points.get(i+1).getY());
            if (temp > longest){
                longest = temp;
            }
        }
        
        return longest;
    }
}
