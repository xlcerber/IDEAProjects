package HelloWorld;

/**
 * Created by User on 23.09.2016.
 */
public class Point {
    private double  x = 0;
    private double y = 0;

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }

    Point() {
    }

    Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }
}