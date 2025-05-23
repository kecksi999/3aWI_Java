public class Fish {
    private String name;
    private double size;

    public Fish(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public void swim() {
        System.out.println(name + " schwimmt.");
    }

    public void describe() {
        System.out.println(name + " ist " + size + " cm groß.");
    }
}
