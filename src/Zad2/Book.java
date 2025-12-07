package Zad2;

public class Book {
    String title;
    String author;
    int year;
    boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " " + year;
    }
}
