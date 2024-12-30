package Day2.Constructors;

public class Account {
    int accountNumber;
    double balance;
    public Account()
    {
        this.accountNumber = 468608;
        this.balance = 5000;
    }
    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        {
            Account a1=new Account();
            a1.display();
            Account a2 = new Account(5687808, 15000);
            a2.display();
        }
    }
}
