package oop.lesson4.shapes;

/**
 * Created by Xepcoh on 24.09.2016.
 */
public class Rectangle implements Shape {
    private final double height;
    private final double wight;

    public Rectangle(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+wight);
    }
}
