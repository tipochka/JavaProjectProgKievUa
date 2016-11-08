package oop.course_project;


import java.util.*;

/**
 * Created by Xepcoh on 28.10.2016.
 */
public class Publisher {
    private final int id;
    private String name;
    private String referencePhoto;
    private String description;
    private String address;
    private Set<Book> books = new TreeSet<>();

    public Publisher(int id, String name) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

        Publisher publisher = (Publisher) o;

        if (id != publisher.id) return false;
        if (!name.equals(publisher.name)) return false;
        if (referencePhoto != null ? !referencePhoto.equals(publisher.referencePhoto) : publisher.referencePhoto != null)
            return false;
        if (description != null ? !description.equals(publisher.description) : publisher.description != null)
            return false;
        if (address != null ? !address.equals(publisher.address) : publisher.address != null) return false;
        return books != null ? books.equals(publisher.books) : publisher.books == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (referencePhoto != null ? referencePhoto.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", referencePhoto='" + referencePhoto + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
