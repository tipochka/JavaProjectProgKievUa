package oop.lesson4.shapes;

import java.util.*;

/**
 * Created by Xepcoh on 24.09.2016.
 */
public class ShapeRunner {
    public static void main(String[] args) {
        List<Shape> shapeList= new ArrayList<>();
        shapeList.add(new Circle(5));
        shapeList.add(new Rectangle(4, 2));

        System.out.println(perimatersSum(shapeList));
    }

    public static double perimatersSum(List<Shape> shapeList) {
        double sum = 0;

        for (Shape shape: shapeList) {
            sum += shape.getPerimeter();
        }

        return sum;
    }
}
