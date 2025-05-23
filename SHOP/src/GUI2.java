import java.util.Scanner;

public class GUI2 {
    private Shop shop;

    public GUI2(Shop shop) {
        this.shop = shop;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("图形用户界面1");
            System.out.println("1. 显示产品");
            System.out.println("2. 添加产品");
            System.out.println("0. 退出");
            System.out.print("选择: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                shop.printProducts();

            } else if (input == 2) {
                System.out.println("你想添加哪种产品？");
                System.out.println("1. 耐克Air");
                System.out.println("2. Galaxy S20");
                System.out.print("选择: ");
                int auswahl = scanner.nextInt();
                scanner.nextLine();

                if (auswahl == 1) {
                    System.out.println("已添加耐克Air！");
                } else if (auswahl == 2) {
                    System.out.println("已添加Galaxy S20！");
                }

            } else if (input == 0) {
                System.out.println("正在退出图形用户界面1...");
                break;

            } else {
                System.out.println("无效的输入。");
            }
        }

        scanner.close();
    }
}