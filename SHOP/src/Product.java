public abstract class Product {
    private int id;
    private double price;
    private String title;
    private String description;

    public Product(int id, double price, String title, String description) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.description = description;
    }

    public Product() {

    }

    public int getId() { return id; }

    public abstract int getID();

    public double getPrice() { return price; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }

}
