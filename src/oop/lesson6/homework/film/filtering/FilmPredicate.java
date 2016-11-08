package oop.lesson6.homework.film.filtering;

import oop.lesson6.homework.film.Film;
import oop.lesson6.homework.film.Genre;

import java.util.List;

/**
 * Created by Xepcoh on 08.11.2016.
 */
public class FilmPredicate {
    private FilmPredicate(){}

    public static Predicate<Film> conteintsInGenres(List<Genre> genres) {
        return new Predicate<Film>() {
            @Override
            public boolean apply(Film elem) {
                for (Genre filmGanre : elem.getGenres()) {
                    for (Genre genre : genres) {
                        if(genre.equals(filmGanre)) {
                            return true;
                        }
                    }
                }

                return false;
            }
        };
    }

    public static Predicate<Film> withReleaseYearBetween (int fromYear, int toYear) {
        return new Predicate<Film>() {
            @Override
            public boolean apply(Film elem) {
                return elem.getYear()>=fromYear && elem.getYear()<=toYear;
            }
        };
    }
}
