package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    public Notebook(int pageCount, boolean isHardCover, String title, Double price) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return super.toString() + " PageCount: " + pageCount + " HardCover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        return getNextId();
    }
}
