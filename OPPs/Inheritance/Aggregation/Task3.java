// 3. Hierarchical Inheritance:
//    Design a Java system for managing different types of bank accounts (Savings, Current) using hierarchical inheritance with a base class "Account" and two derived classes "SavingsAccount" and "CurrentAccount."
class BankAccount{
    private int accountId;
    private String holderName;
    private double accountBalance;

    public BankAccount(int accountId, String holderName, double accountBalance) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
    }

    public void showInfo() {
        System.out.println("-- Account Details --");
        System.out.println("Account Id :" + this.accountId);
        System.out.println("Account Holder Name :" + this.holderName);
    }
    public double getBalance() {
        return this.accountBalance;
    }

    public void deposite(double amount) {}
}
class SavingsAccount extends BankAccount{
    private float interest;
    public SavingsAccount(int accountId, String holderName, double accountBalance, float interest) {
        super(accountId, holderName, accountBalance);
        this.interest = interest;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Balance (with interest):" + getBalance()+(getBalance()*interest/100));
    }
}
class CurrentAccount extends BankAccount{
    private float interest;
    public CurrentAccount(int accountId, String holderName, double accountBalance, float interest) {
        super(accountId, holderName, accountBalance);
        this.interest = interest;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Balance (with interest) :" + this.getBalance()+(getBalance()*interest/100));
    }
}

public class Task3 {
    public static void main(String []args) {}
}
