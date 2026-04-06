public abstract class BankAccount {
    String accountHolder;
    protected double balance;
    String accountNumber;

    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract void applyCharges();

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient Balance");
        }
    }

    public double getBalance() {
        System.out.println("Your Balance: " + balance);
        return balance;
    }

    public abstract void printStatement();
}
