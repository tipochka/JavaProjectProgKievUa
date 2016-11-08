package oop.lesson1.homework.rectange;

public class Rectangle
{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int perimeter() {
        return height*2 + width*2;
    }

    public int area() {
        return height*width;
    }
}
