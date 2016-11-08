package oop.lesson2.homework.lines;


public class Line {
    private final Point start;
    private final Point stop;

    public Line(Point start, Point stop) {
        this.start = start;
        this.stop = stop;
    }

    public final double length() {
        int catet1 = Math.abs(start.getX() - stop.getX());
        int catet2 = Math.abs(start.getY() - stop.getY());

        double result = Math.sqrt(Math.pow(catet1, 2) + Math.pow(catet2, 2));

        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", stop=" + stop +
                '}';
    }
}
