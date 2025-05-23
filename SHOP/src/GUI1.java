import java.util.Scanner;

public class GUI1 {
    private Shop shop;

    public GUI1(Shop shop) {
        this.shop = shop;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("GUI1");
            System.out.println("1. Produkte anzeigen");
            System.out.println("2. Produkt hinzufügen");
            System.out.println("0. Beenden");
            System.out.print("Auswahl: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                shop.printProducts();

            } else if (input == 2) {
                System.out.println("Welches Produkt möchtest du hinzufügen?");
                System.out.println("1. Nike Air");
                System.out.println("2. Galaxy S20");
                System.out.print("Auswahl: ");
                int auswahl = scanner.nextInt();
                scanner.nextLine();

                if (auswahl == 1) {

                    System.out.println("Nike Air wurde hinzugefügt!");
                } else if (auswahl == 2) {

                    System.out.println("Galaxy S20 wurde hinzugefügt!");
                }

            } else if (input == 0) {
                System.out.println("Beende GUI1...");
                break;

            } else {
                System.out.println("Ungültige Eingabe.");
            }
        }

        scanner.close();
    }
}
