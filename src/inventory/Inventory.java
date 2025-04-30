package inventory;
import products.Product;
import java.util.*;

public class Inventory <T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount (String productName, int discount){
        for(T item : items){
            if (item.getTitle().equals(productName)){
                double discountedPrice = item.getPrice() * (1 - discount / 100.0);
                item.setPrice(discountedPrice);
            }
        }
    }

    public void addItems (T product){
        items.add(product);
    }

    public void removeItemsById(String id){
        T Remove = null;
        for (T item : items) {
            if (item.getId().equals(id)) {
                break;
            }
        }
        if (Remove != null) {
            items.remove(Remove);
        }
    }
    public T findItemsById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void displayAll(){
        for (T item : items) {
            System.out.println(item);
        }
    }

}
