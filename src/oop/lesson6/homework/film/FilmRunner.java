package oop.lesson6.homework.film;

import oop.lesson6.homework.film.filtering.FilmPredicate;
import oop.lesson6.homework.film.filtering.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 04.11.2016.
 */
public class FilmRunner {
    public static void main(String[] args) {
        List<Film> films = FilmsFill();
        List<Genre> genres = new ArrayList<>();
        genres.add(Genre.HORROR);
        genres.add(Genre.THRILLER);

        System.out.println(Filter.filter(films, FilmPredicate.conteintsInGenres(new ArrayList<>(genres))));
        System.out.println(Filter.filter(films, FilmPredicate.withReleaseYearBetween(1990, 2001)));

    }

    private static List<Film> FilmsFill() {
        Film film1 = new Film("Inferno", 2016);
        film1.addGenre(Genre.ACTION)
                .addGenre(Genre.THRILLER);
        Film film2 = new Film("Trainspotting", 1995);
        film2.addGenre(Genre.DRAMMA);
        Film film3 = new Film("Serbuan maut", 2011);
        film3.addGenre(Genre.THRILLER)
                .addGenre(Genre.ACTION);
        Film film4 = new Film("Whiplash", 2013);
        film4.addGenre(Genre.DRAMMA);
        Film film5 = new Film("Silent Hill", 2006);
        film5.addGenre(Genre.HORROR);

        List<Film> films = new ArrayList<>();
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);

        return films;
    }
}
