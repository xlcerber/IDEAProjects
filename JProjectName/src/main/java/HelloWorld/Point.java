package HelloWorld;

/**
 * Created by User on 23.09.2016.
 */
public class Point {
    double x = 0;
    double y = 0;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    Point() {}

    Point (double x, double y){
        this.x = x;
        this.y = y;
    }
}
