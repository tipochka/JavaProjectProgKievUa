package oop.course_project.io;

import oop.course_project.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 29.10.2016.
 */
public class BookIOUtils {

    private BookIOUtils(){};

    public static List<Book> readBookFromFile (String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readBook(reader);
        }
    }

    public static List<Book> readBook(BufferedReader reader) throws IOException {
        List<Book> result = new ArrayList<>();

        String line;

        while ((line = reader.readLine()) != null) {
            Book book = parseBook(line);
            result.add(book);
        }

        return result;
    }

    public static Book parseBook(String line) {
        String[] tokens = line.split(";");

        if (tokens.length < 11) {
            throw new IllegalArgumentException("Missing values: " + line);
        }

        int id = Integer.parseInt(tokens[0].trim());
        String name = tokens[1].trim();

        Book book = new Book(id, name);

        return book;
    }
}
