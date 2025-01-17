public class Clownfish extends Fish {
    String colorPattern;

    public Clownfish(String name, double size, String colorPattern) {
        super(name, size);
        this.colorPattern = colorPattern;
    }

    @Override
    public void swim() {
        System.out.println(name + " schwimmt verspielt, wie ein Clownfisch.");
    }

    @Override
    public void describe() {
        System.out.println(name + " ist " + size + " cm groß. Farbmuster: " + colorPattern);
    }
}
