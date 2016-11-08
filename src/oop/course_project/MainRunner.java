package oop.course_project;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static oop.course_project.io.BookIOUtils.*;

/**
 * Created by Xepcoh on 28.10.2016.
 */
public class MainRunner {

    public static final String INPUT_BOOK_FILE = "files/book.csv";
    public static final String INPUT_AUTHOR_FILE = "files/author.csv";
    public static final String INPUT_PUBLISHER_FILE = "files/publisher.csv";

    public static final String INPUT_BOOK_BIN_FILE = "files/book.bin";
    public static final String INPUT_AUTHOR_BIN_FILE = "files/author.bin";
    public static final String INPUT_PUBLISHER_BIN_FILE = "files/publisher.bin";

    public static void main(String[] args) throws IOException {
      //  Map<Integer, Author> = readAuthorFromFile(INPUT_AUTHOR_FILE);

        List<Book> books = readBookFromFile(INPUT_BOOK_FILE);

    }
}
