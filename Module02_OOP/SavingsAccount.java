public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, String accountNumber, double interestRate) {
        super(accountHolder, balance, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void applyCharges() {
        balance += balance * this.interestRate;
    }

    @Override
    public void printStatement() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: Savings Account");
        System.out.println("Account Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate);
    }

}
