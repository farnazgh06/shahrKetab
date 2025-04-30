package products;

public class Accessory extends Product {
    private String color;

    public Accessory(String color, String title, Double price) {
        super(title, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color;
    }

    @Override
    protected String generateId() {
        return getNextId();
    }
}
