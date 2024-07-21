// 15. Constructor with Validation:
//    Write a 'BankAccount' class with fields for 'accountNumber' and 'balance'. The constructor should validate that the 'balance' is not negative. If it is, set the balance to 0 and print a warning message.

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.accountBalance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (accountBalance < 0) {
            System.out.println("Warning: Initial balance is negative. Setting balance to 0.");
            this.accountBalance = 0.0;
        } else {
            this.accountBalance = accountBalance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds current balance.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            accountBalance -= amount;
        }
    }
}

public class Task15 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "Jane Doe", -50.0); // This will trigger the warning and set balance to 0

        System.out.println("Account Number: " + account1.getAccountNumber() + ", Account Holder: " + account1.getAccountHolderName() + ", Balance: $" + account1.getAccountBalance());
        System.out.println("Account Number: " + account2.getAccountNumber() + ", Account Holder: " + account2.getAccountHolderName() + ", Balance: $" + account2.getAccountBalance());

        account1.deposit(500.0);
        account1.withdraw(200.0);

        System.out.println("Account Number: " + account1.getAccountNumber() + ", Account Holder: " + account1.getAccountHolderName() + ", Balance: $" + account1.getAccountBalance());
    }
}
