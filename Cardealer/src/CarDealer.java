import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle> vehicleList;

    public CarDealer() {
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        System.out.println("Fahrzeug hinzugefügt: " + vehicle.getName());
    }

    public CarDealer(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void printVehicles() {
        System.out.println(vehicleList);


}}