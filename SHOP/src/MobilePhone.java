public class MobilePhone extends Product {
    public MobilePhone(int id, double price, String title, String description) {
        super(id, price, title, description);
    }

    @Override
    public int getID() {
        return 0;
    }

    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}