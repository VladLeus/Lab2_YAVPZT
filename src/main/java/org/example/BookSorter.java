package org.example;

import java.util.Comparator;
import java.util.List;

public class BookSorter {

    public static List<Book> sortByTitle(List<Book> books) {
        books.sort(Comparator.comparing(Book::getTitle));
        return books;
    }

    public static List<Book> sortByAuthor(List<Book> books) {
        books.sort(Comparator.comparing(Book::getAuthor));
        return books;
    }

    public static List<Book> sortByYear(List<Book> books) {
        books.sort(Comparator.comparingInt(Book::getYear));
        return books;
    }

    public static List<Book> sortByPrice(List<Book> books) {
        books.sort(Comparator.comparingDouble(Book::getPrice));
        return books;
    }
}
