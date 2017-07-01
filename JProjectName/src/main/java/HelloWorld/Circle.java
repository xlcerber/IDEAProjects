package HelloWorld;

/**
 * Created by User on 20.09.2016.
 */
public class Circle implements Shape {
    double r = 0;

    public Circle(double r) {
        this.r = r;
    }

    void init() {
        System.out.println("Init Circle");
    }

    @Override
    public double Square() {
        return Math.PI * Math.pow(r, 2);
    }
}
