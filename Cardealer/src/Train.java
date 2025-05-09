public class Train extends AbstractVehicle {
    public Train(String name, int id) {
        super(name, id);
    }

    public void drive() {
        System.out.println(getName() + " fährt auf Schienen.");
    }
}
