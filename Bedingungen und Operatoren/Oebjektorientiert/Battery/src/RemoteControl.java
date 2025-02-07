public class RemoteControl {
    private Battery battery1;
    private Battery battery2;

    public Battery getBattery2() {
        return battery2;
    }

    public Battery getBattery1() {
        return battery1;
    } //Luca zur Erklärung

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }

    public RemoteControl(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public int getStatus() {
        int totalCharge = 0;
        totalCharge += battery1.getChargeLevel();
        totalCharge += battery2.getChargeLevel();
        return totalCharge;
    }

    public void turnOn() {
        System.out.println("Fernbedienung eingeschaltet");
        battery1.connectConsumer();
        battery1.reduceCharge(5);
        battery2.connectConsumer();
        battery2.reduceCharge(5);
    }

    public void turnOff() {
        System.out.println("Fernbedienung ausgeschaltet");
        battery1.disconnectConsumer();
        battery2.disconnectConsumer();
    }
}
