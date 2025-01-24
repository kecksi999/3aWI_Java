public class Clownfish extends Fish {
    private String colorPattern;

    public Clownfish(String name, double size, String colorPattern) {
        super(name, size);
        this.colorPattern = colorPattern;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " schwimmt verspielt, wie ein Clownfisch.");
    }

    @Override
    public void describe() {
        System.out.println(getName() + " ist " + getSize() + " cm groß. Farbmuster: " + colorPattern);
    }

    public String getColorPattern() {
        return colorPattern;
    }
}