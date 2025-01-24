public class Shark extends Fish {
    private int teeth;

    public Shark(String name, double size, int teeth) {
        super(name, size);
        this.teeth = teeth;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " schwimmt schnell, weil es ein Hai ist!");
    }

    @Override
    public void describe() {
        super.describe();
    }

    public void describe(String detail) {
        System.out.println(getName() + " ist " + getSize() + " cm groß. Detail: " + detail);
    }
}
