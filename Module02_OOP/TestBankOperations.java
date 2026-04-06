public class TestBankOperations {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("Nimai", 1000, "ACC001", 0.05),
            new SavingsAccount("Vishal", 500, "ACC002", 0.05),
            new CheckingAccount("Rabi", 2000, "ACC009", 10)
        };

        System.out.println("=== INITIAL BALANCES ===\n");
        for (BankAccount acc : accounts) {
            acc.printStatement();
            System.out.println();
        }

        System.out.println("\n=== APPLYING CHARGES ===\n");
        for (BankAccount acc : accounts) {
            acc.applyCharges();
            acc.printStatement();
            System.out.println();
        }

        System.out.println("\n=== AFTER WITHDRAWAL ===\n");
        accounts[0].withdraw(100);  // Savings - OK
        accounts[2].withdraw(300);  // Checking - OK
        accounts[2].withdraw(600);  // Checking - BLOCKED (>500)
        
        for (BankAccount acc : accounts) {
            acc.printStatement();
            System.out.println();
        }
    }
}
