package Day2.OopsBasic;

import java.util.Scanner;

public class BankAccount {
    private int AccountNumber;
    private double balance;
    public BankAccount(int AaccountNumber, double balance) {
        this.AccountNumber = AaccountNumber;
        this.balance = balance;
    }
    public void deposit(double deposit)
    {
        balance=balance+deposit;
        System.out.println("Account number: "+AccountNumber+"\n Deposited:"+deposit+"\n Balance:"+balance);
    }
    public void withdraw(double withdraw)
    {
        balance=balance-withdraw;
        System.out.println("Account number: "+AccountNumber+"\n withdraw: "+withdraw+balance+"\n Balance:"+balance);
    }
    public void checkbalance()
    {
     System.out.println("Account number: "+AccountNumber+"\n Balance:"+balance);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BankAccount account = new BankAccount(34567890,350000);
        account.deposit(1000);
        account.withdraw(5000);
        account.checkbalance();
    }
}