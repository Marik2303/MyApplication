public class Shape{
    private Point[] points;
    private int size;
    private int buffer = 3;

    public Shape() {
        points = new Point[buffer];
    }

    private void ChangeBuffer(){
        buffer *=2;
        Point[] NewPoint = new Point[buffer];

        for (int i = 0; i < points.length; i++) {
            NewPoint[i] = points[i];
        }
        points = NewPoint;
    }

    public void AddPoint(Point Add){
        if (size == buffer){
            ChangeBuffer();
        }

        points[size++] = Add;

    }
    
    public double calculatePerimeter(){
        double perimeter = 0;

        for (int i = 0; i < - 1 + points.length; i++) {
            perimeter += points[i].distanceTo(points[i+1].getX(), points[i+1].getY());
        }

        return perimeter + points[points.length-1].distanceTo(points[0].getX(), points[0].getY());
    }

    public double getAverageSide() {
        return this.calculatePerimeter() / this.points.length;
    }

    public double getLongest() {
        double longest = points[0].distanceTo(points[1].getX(),points[1].getY());
        double temp = 0;
        for (int i = 0; i < points.length-1; i++) {
            temp = points[i].distanceTo(points[i+1].getX(),points[i+1].getY());
            if (temp > longest){
                longest = temp;
            }
        }


        return longest;
    }
}