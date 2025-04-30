package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    private static int counter = 1;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    protected static String getNextId() {
        return String.format("%04d", counter++);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Title: " + title + " Price: " + price;
    }

    protected abstract String generateId();
}
