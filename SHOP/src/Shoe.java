public class Shoe extends Product {
    private int id;
    private double price;
    private String title;
    private String description;
    private String color;

    public Shoe(int id, double price, String title, String description, String color) {
        super();
        this.id = id;
        this.price = price;
        this.title = title;
        this.description = description;
        this.color = color;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
