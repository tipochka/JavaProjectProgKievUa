package oop.course_project;

import java.util.*;

/**
 * Created by Xepcoh on 28.10.2016.
 */
public class Author {
    private final int id;
    private String name;
    private String referencePhoto;
    private String biography;
    private Set<Book> books = new TreeSet<>();

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferencePhoto() {
        return referencePhoto;
    }

    public void setReferencePhoto(String referencePhoto) {
        this.referencePhoto = referencePhoto;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (id != author.id) return false;
        if (!name.equals(author.name)) return false;
        if (referencePhoto != null ? !referencePhoto.equals(author.referencePhoto) : author.referencePhoto != null)
            return false;
        if (biography != null ? !biography.equals(author.biography) : author.biography != null) return false;
        return books != null ? books.equals(author.books) : author.books == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (referencePhoto != null ? referencePhoto.hashCode() : 0);
        result = 31 * result + (biography != null ? biography.hashCode() : 0);
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", referencePhoto='" + referencePhoto + '\'' +
                ", biography='" + biography + '\'' +
                ", books=" + books +
                '}';
    }
}