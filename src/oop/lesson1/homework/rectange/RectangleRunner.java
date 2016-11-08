package oop.lesson1.homework.rectange;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle[] listRectangles = {new Rectangle(8, 4), new Rectangle(5, 6), new Rectangle(7, 6)};

        System.out.println(sumArea(listRectangles));

    }

    public static int sumArea(Rectangle[] listRectungles) {
        int sumArea = 0;
        for (Rectangle rectungle: listRectungles) {
            sumArea += rectungle.area();
        }

        return sumArea;
    }
}
