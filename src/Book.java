public class Book {
    String name;
    int cost;
    String author;

    public Book(String name, int cost, String author) {
        this.name = name;
        this.cost = cost;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', cost=" + cost + ", author='" + author + "'}";
    }
}
