// 3. Hierarchical Inheritance:
//    Design a Java system for managing different types of bank accounts (Savings, Current) using hierarchical inheritance with a base class "Account" and two derived classes "SavingsAccount" and "CurrentAccount."

import java.util.Scanner;

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

    public void deposite(double amount) {
        if(amount <= 0) {
            System.out.println("Error : can not deposite this amount. Enter Valid amount.");
        }
        else {
            this.accountBalance += amount;
            System.out.println("Account Id :" + this.accountId + "\nGet " + amount + " deposite successfully.");
        }
    }
    public void credite(double amount) {
        if(amount <= 0 ) {
            System.out.println("Error : can not credite this amount. Enter Valid amount.");
        }
        else {
            this.accountBalance -= amount;
            System.out.println("Account Id :" + this.accountId + "Get credited " + amount + " by this amount successufully.");
        }
    }
}
class SavingsAccount extends BankAccount{
    private float interest;
    Scanner sc = new Scanner(System.in);
    public SavingsAccount(int accountId, String holderName, double accountBalance, float interest) {
        super(accountId, holderName, accountBalance);
        this.interest = interest;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Balance (with interest):" + getBalance()+(getBalance()*interest/100));
    }
    public void deposite() {
        System.out.println("Enter Amount To deposite into account :");
        double amount = sc.nextDouble();
        super.deposite(amount);
        sc.close();
    }
   
}
class CurrentAccount extends BankAccount{
    private float interest;
    Scanner sc = new Scanner(System.in);
    public CurrentAccount(int accountId, String holderName, double accountBalance, float interest) {
        super(accountId, holderName, accountBalance);
        this.interest = interest;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Balance (with interest) :" + this.getBalance()+(getBalance()*interest/100));
    }
    public void credite() {
        System.out.println("Enter Amount To Credite :");
        double amount = sc.nextDouble();
        super.credite(amount);
        sc.close();
    }
}

public class Task3 {
    public static void main(String []args) {
        SavingsAccount s1 = new SavingsAccount(101, "Divy", 1000, 8f);
        s1.showInfo();
    }
}
