package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    public Book(String author, String publication, String genre, String title, Double price) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + " Author: " + author + " Publication: " + publication + " Genre: " + genre;
    }

    @Override
    protected String generateId() {
        return getNextId();
    }
}
