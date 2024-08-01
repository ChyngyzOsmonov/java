import java.util.List;

public class Library {
    private List<Book> books;
    private int bookIndex;

    public Library(List<Book> books, int bookIndex) {
        this.books = books;
        this.bookIndex = bookIndex;
    }

    public void addBook(Book book) {
        if (books.size() == 50) {
            System.out.println("You can add only 50 books");
        } else {
            books.add(book);
        }
    }

    public Book getBookByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author.getName())) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(int bookIndex) {
        this.bookIndex = bookIndex;
    }
}
