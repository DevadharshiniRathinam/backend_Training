package Day2.AddditionalChallenges;

public class BankSystem {
    int AccountId;
    double balance;
    public BankSystem(int AccountId, double balance) {
        this.AccountId=AccountId;
        this.balance=balance;
    }
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("AccountId: "+AccountId+"\nDeposited: "+amount);
    }
    public void withdraw(double amount) {
        balance=balance-amount;
        System.out.println("AccountId: "+AccountId+"\nWithdrawn: "+amount);
    }
    public void checkBalance() {
        System.out.println("AccountId: "+AccountId+"\nBalance: "+balance);
    }
    public static void main(String[] args) {
        BankSystem BankSystem=new BankSystem(1230,34000);
        BankSystem.deposit(1000);
        BankSystem.withdraw(15000);
        BankSystem.checkBalance();
    }
}
