import products.Product;
import products.Notebook;
import products.Book;
import products.Accessory;
import inventory.Inventory;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double totalPrice = 0;
        for (Product item : inventory.getItems()) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        Book bookNumber1 = new Book("saadi", "kheiliSabz", "Adabiat", "Golsetan", 300.45);
        Book bookNumber2 = new Book("ferdoosi", "gaj", "Adabiat", "shahnameh", 650.20);
        Notebook notebookNumber1 = new Notebook(200, false, "green notebook", 300.0);
        Notebook notebookNumber2 = new Notebook(100, true, "black notebook", 150.50);
        Accessory accessoryNumber1 = new Accessory("black", "pencil", 20.5);
        Accessory accessoryNumber2 = new Accessory("red", "pencilCase", 20.5);

        bookInventory.addItems(bookNumber1);
        bookInventory.addItems(bookNumber2);
        notebookInventory.addItems(notebookNumber1);
        notebookInventory.addItems(notebookNumber2);
        accessoryInventory.addItems(accessoryNumber1);
        accessoryInventory.addItems(accessoryNumber2);

        bookInventory.removeItemsById("1001");
        accessoryInventory.removeItemsById("3001");

        System.out.println("Book TotalPrice :");
        System.out.println(calculateTotalPrice(bookInventory));
        System.out.println("Notebook TotalPrice :");
        System.out.println(calculateTotalPrice(notebookInventory));
        System.out.println("Accessory TotalPrice :");
        System.out.println(calculateTotalPrice(accessoryInventory));


        bookInventory.findItemsById("1001");
        accessoryInventory.findItemsById("3002");

        accessoryInventory.applyDiscount("pencil", 50);
        notebookInventory.applyDiscount("black notebook", 35);

        System.out.println("Show BookInventory");
        bookInventory.displayAll();
        System.out.println("Show notebookInventory");
        notebookInventory.displayAll();
        System.out.println("Show accessoryInventory");
        accessoryInventory.displayAll();

    }

}