public class Main {
    public static void main(String[] args) {
        BankAccount janAccount = new BankAccount("Jan", 2000000);
        BankAccount moritzAccount = new BankAccount("Moritz", 3);
        BankAccount davidAccount = new BankAccount("David", 10000);

        janAccount.deposit(5000);
        janAccount.withdraw(2000);

        moritzAccount.displayBalance();


        BankAccount.changeBankName("BankderSigmas");
    }
}
