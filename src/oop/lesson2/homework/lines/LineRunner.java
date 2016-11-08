package oop.lesson2.homework.lines;


public class LineRunner {
    public static void main(String[] args) {
        Line[] lines = {new Line(new Point(3, 3), new Point(6, 6)), new Line(new Point(5, 5), new Point(10, 10))};

        System.out.println("Summary Lenght Line: " + sumLength(lines));
        System.out.println("Max Line: " + maxLengthLine(lines));

    }

    public static double sumLength(Line[] lines) {
        checkingLines(lines);

        double sum = 0;

        for(Line line : lines) {
            sum += line.length();
        }

        return sum;
    }

    public static Line maxLengthLine(Line[] lines) {
        checkingLines(lines);

        Line max = null;

        for(Line line : lines) {
            if(max == null || line.length()>max.length()){
                max = line;
            }
        }

        return max;
    }

    public static void checkingLines (Line[] lines) {
        if (lines.length == 0) {
            throw new IllegalArgumentException("Non Line element");
        }
    }
}
