public class Car extends AbstractVehicle {
    public Car(String name, int id) {
        super(name, id);
    }

    public void drive() {
        System.out.println(getName() + " fährt");
    }
}
