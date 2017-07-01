package HelloWorld;

public class Rectangle implements Shape{
    double height = 1;
    double width = 1;


    Point point;

    public void setPoint(Point point) {
        this.point = point;
    }

    Rectangle() {
       // this.height = point.x;
       // this.width =  point.y;
    }

    void init() {
        System.out.println("Init Rectangle");
    }

   /* Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
*/
    /*
    Rectangle(Point topLeft, Point bottomRight) {
        this.height = Math.abs(point.x + point.x);
        this.width = Math.abs(point.y + point.y);
    }
*/

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double Square() {
        //System.out.println(point.x + " " + point.y);
        //return height * width;
        return point.x * point.y;
    }




}
