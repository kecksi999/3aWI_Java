

public class BankAccount {
    private String owner;
    private double balance;
    private static String bankName = "Sigma";



    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Geld eingezahlt. Neue Balance " + this.balance + "€");
        } else {
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Geld abgehoben. Neue Balance " + this.balance + "€");
        } else {
        }
    }

    public void displayBalance() {
        System.out.println("Jetzige Balance " + this.balance + "€");
    }

    public static void changeBankName(String newName) {
        bankName = newName;
        System.out.println("Neuer Bankname: " + bankName);
    }
}

