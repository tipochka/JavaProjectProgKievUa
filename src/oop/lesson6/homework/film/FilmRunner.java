package oop.lesson6.homework.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Xepcoh on 04.11.2016.
 */
public class FilmRunner {
    public static void main(String[] args) {
        List<Film> films = FilmsFill();

        List<Genre> genres = new ArrayList<>(Arrays.asList(Genre.HORROR, Genre.THRILLER));

        System.out.println(filterBetweenYears(films, 1990, 2001));
        System.out.println(filterInGenres(films, genres));

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

        List<Film> films = new ArrayList<>(Arrays.asList(film1, film2, film3, film4, film5));

        return films;
    }

    private static List<Film> filterInGenres(List<Film> films, List<Genre> genres) {
        return films.stream()
                .filter(b -> b.getGenres().stream()
                        .anyMatch(c -> genres.contains(c)))
                .collect(Collectors.toList());
    }

    private static List<Film> filterBetweenYears(List<Film> films, int yearFrom, int yearTo) {
        return films.stream()
                .filter(b -> b.getYear() >= yearFrom && b.getYear() <= yearTo)
                .collect(Collectors.toList());
    }

}
