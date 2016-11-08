package oop.lesson6.homework.film.filtering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 08.11.2016.
 */
public class Filter {
    private Filter(){}

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        List<T> res = new ArrayList<T>();

        for(T elem : elems) {
            if(predicate.apply(elem)) {
                res.add(elem);
            }
        }
        return res;
    }
}
