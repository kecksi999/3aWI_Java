import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProducts() {
        System.out.println("== Produktliste ==");
        for (Product p : products) {
            System.out.println("- " + p.getTitle() + " | " + p.getPrice() + " €");
        }
    }
}
