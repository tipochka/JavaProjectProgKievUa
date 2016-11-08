package oop.lesson7.homework.range;




/**
 * Created by Xepcoh on 19.10.2016.
 */
public class Range <T extends Number> {
    final private T from;
    final private T to;

    public Range(T from, T to) {
        changeInParams(from, to);
        this.from = from;
        this.to = to;
    }

    private void changeInParams(T from, T to) {

        if (from.doubleValue() > to.doubleValue() ) {
            throw new IllegalArgumentException("from > to");
        }
    }

    public T getFrom() {
        return from;
    }

    public T getTo() {
        return to;
    }
}
