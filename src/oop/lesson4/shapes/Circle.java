package oop.lesson4.shapes;

/**
 * Created by Xepcoh on 24.09.2016.
 */
public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
