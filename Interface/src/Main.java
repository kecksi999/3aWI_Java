import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        // Beispielprodukte hinzufügen
        productList.add(new Shoe("Nike", 120));
        productList.add(new Pants("Jeans", 89));
        productList.add(new Shirts("T-Shirt", 14));



        while(true) {
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                default:
                    viewProducts(productList);
            }
        }

    }

    public static void viewProducts(List<Product> productList) {
        System.out.println("Verfügbare Produkte:");
        for (Product product : productList) {
            System.out.println("Product: " + product.getName() + ", Price: €" + product.getPrice());

        }
    }
}
