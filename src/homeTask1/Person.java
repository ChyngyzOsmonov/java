package homeTask1;

import java.util.Arrays;

public class Person {
    Book[] book;

    public Person(Book[] book) {
        this.book = book;
        System.out.println(Arrays.toString(book));
    }
}
