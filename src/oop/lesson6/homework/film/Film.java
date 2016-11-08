package oop.lesson6.homework.film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 03.11.2016.
 */
public class Film {
    final private String name;
    final private int year;
    private List<Actor> actors = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Film addGenre(Genre genre) {
        genres.add(genre);
        return this;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                ", genres=" + genres +
                '}';
    }
}
