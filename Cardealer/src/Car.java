public class Car implements Vehicle {
    private String name;
    private int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return(name);

    }

    public int getId() {
        return(id);
    }

    public void drive() {
        System.out.println(name + "fährt");
    }
}
