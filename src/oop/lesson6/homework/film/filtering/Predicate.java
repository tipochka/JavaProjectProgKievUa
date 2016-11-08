package oop.lesson6.homework.film.filtering;

/**
 * Created by Xepcoh on 08.11.2016.
 */
public interface Predicate<T> {
    public boolean apply(T elem);
}
