public class Bank {

    public static void main(String[] args) {
        BankAccount s1 = new SavingsAccount("Nimai", 0, "ACC001", 5);
        BankAccount s2 = new SavingsAccount("Vishal", 100, "ACC002", 5);
        BankAccount c1 = new CheckingAccount("Rabi", 10, "ACC009", 5);

        BankAccount[] accounts = { s1, s2, c1 };

        for (BankAccount acc : accounts) {
            acc.printStatement();
        }
    }
}
