public class Driller extends Product {

    public Driller(String color) {
        super(color);
    }


    @Override
    protected void color() {
        System.out.println("Color2");
    }

    public static void main(String[] args) {
        Driller driller = new Driller("Red");
        driller.color();
    }
}
