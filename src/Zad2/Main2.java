package Zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    HashMap<String,Book> bookByAuthor = new HashMap<>();

    books.add(new Book("Numbers Don't Lie", "Vaclav Smil", 2020));
    books.add(new Book("How the World Really Works", "Vaclav Smil", 2022));
    books.add(new Book("Energy and Civilization", "Vaclav Smil", 2017));
    books.add(new Book("Clean Code", "Robert C. Martin", 2008));
    books.add(new Book("Sapiens", "Yuval Noah Harari", 2011));
    books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 1999));
    books.add(new Book("Atomic Habits", "James Clear", 2018));

    books.stream().map(x -> x.author);


    }
}
