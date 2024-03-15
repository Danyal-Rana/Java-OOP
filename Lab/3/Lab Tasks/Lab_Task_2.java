class Account
{
    private double balance;

    public Account ()
    {
        this.balance = 0;
    }

    public Account (double balance)
    {
        this.balance = balance;
    }

    public void setBalance (double balance)
    {
        this.balance = balance;
    }

    public double getBalance ()
    {
        return this.balance;
    }

    public void withdraw (double wBalance)
    {
        this.balance = this.balance - wBalance;
    }

    public void deposit (double dBalance)
    {
        this.balance = this.balance + dBalance;
    }
}

public class Lab_Task_2
{
    public static void main (String[] args)
    {
        Account a1 = new Account ();
        a1.setBalance (1000);
        System.out.println ("The balance of Account 1 is: " + a1.getBalance());
        a1.withdraw (500);
        System.out.println ("Balance after withdraw is: " + a1.getBalance());
        a1.deposit (1500);
        System.out.println ("Balance after deposit is: " + a1.getBalance());

        Account a2 = new Account (a1.getBalance());
        System.out.println ("The balance of account 2 is: " + a2.getBalance());
    }
}