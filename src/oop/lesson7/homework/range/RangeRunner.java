package oop.lesson7.homework.range;

/**
 * Created by Xepcoh on 19.10.2016.
 */
public class RangeRunner {
    public static void main(String[] args) {
        Range<Float> range = new Range<>(0.3f, 0.3f);

        System.out.println("From: " + range.getFrom());
        System.out.println("To: " + range.getTo());
    }
}
