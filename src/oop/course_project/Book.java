package oop.course_project;

import java.util.*;

/**
 * Created by Xepcoh on 28.10.2016.
 */
public class Book {
    private final int id;
    private String name;
    private String referencePhoto;
    private Set<Author> authors = new TreeSet<>();
    private Publisher publisher;
    private int yearPublisher;
    private String isbn;
    private int weight;
    private String description;
    private int price;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<Author> getAuthors() {
        return authors;
    }

    public void addAuthors(Author author) {
        authors.add(author);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (yearPublisher != book.yearPublisher) return false;
        if (weight != book.weight) return false;
        if (price != book.price) return false;
        if (!name.equals(book.name)) return false;
        if (referencePhoto != null ? !referencePhoto.equals(book.referencePhoto) : book.referencePhoto != null)
            return false;
        if (authors != null ? !authors.equals(book.authors) : book.authors != null) return false;
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        return description != null ? description.equals(book.description) : book.description == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (referencePhoto != null ? referencePhoto.hashCode() : 0);
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + yearPublisher;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", referencePhoto='" + referencePhoto + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", yearPublisher=" + yearPublisher +
                ", isbn='" + isbn + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
