// 4. Bank Account Class: Create a `BankAccount` class with a constructor to initialize an account with an account number and balance.

class BankAccount{
    private String accountNumber;
    private double accountBalance;

    //constructors
    public BankAccount() {
        this.accountNumber = "";
        this.accountBalance = 0.0;
    }
    public BankAccount(String accountNumber,double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    //methods
    void bankDetails() {
        System.out.println("\n\nBank Details ,\nBank Account Number :" + this.accountNumber);
        System.out.println("Back Account Balance : " + this.accountBalance);
        if(this.accountBalance <= 1000) {
            System.out.println("Bank Account Number : "+this.accountNumber);
            System.out.println("Has very low Balance, bank account must contain minimum 1000 Rupees.");
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("4050123321", 1500);
        BankAccount b2 = new BankAccount ("123421123", 300 );

        b1.bankDetails();
        b2.bankDetails();
    } 
}
