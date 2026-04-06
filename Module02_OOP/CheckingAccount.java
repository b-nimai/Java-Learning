public class CheckingAccount extends BankAccount {
    double monthlyFee;

    public CheckingAccount(String accountHolder, double balance, String accountNumber, double monthlyFee) {
        super(accountHolder, balance, accountNumber);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Error: Insufficent Balance");
            return;
        }
        if (amount > 500) {
            System.out.println("Error: Checking account can only withdraw up to 500!");
            return;
        }
        if (amount <= 500) {
            balance -= amount;
        }
    }

    @Override
    public void applyCharges() {
        balance -= monthlyFee;
    }

    @Override
    public void printStatement() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: Checking Account");
        System.out.println("Account Balance: $" + balance);
        System.out.println("Monthly Fee: " + monthlyFee);
    }

}
