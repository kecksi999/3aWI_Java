public class AeroCar extends Car {
    public AeroCar(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " fliegt");
    }
}
