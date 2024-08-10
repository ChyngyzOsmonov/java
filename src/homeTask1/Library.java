package homeTask1;

import java.util.Random;

public class Library {
    Random rnd  = new Random();
    public void generateBook() {
        Book[] books = new Book[1];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("d", "n");
        }
        Person person = new Person(books);
    }
}
