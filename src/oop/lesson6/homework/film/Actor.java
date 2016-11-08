package oop.lesson6.homework.film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 03.11.2016.
 */
public class Actor {
    private String name;
    private List<Film> films = new ArrayList<>();

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }
}
