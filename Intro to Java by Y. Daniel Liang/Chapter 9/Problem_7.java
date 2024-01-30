import java.util.*;

class Account
{
    private int ID;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account ()
    {
        this.dateCreated = new Date();
    }

    public Account (int ID, double balance)
    {
        this();
        this.ID = ID;
        this.balance = balance;
    }

    public int getID ()
    {
        return this.ID;
    }

    public double getBalance ()
    {
        return this.balance;
    }

    public static double getAnnualInterestRate ()
    {
        return Account.annualInterestRate;
    }

    public String getDateCreated ()
    {
        return this.dateCreated.toString();
    }

    public void setID (int ID)
    {
        this.ID = ID;
    }

    public void setBalance (double balance)
    {
        this.balance = balance;
    }

    public static void setAnnualInterestRate (double annualInterestRate)
    {
        Account.annualInterestRate = annualInterestRate;
    }

    public static double getMonthlyInterestRate ()
    {
        return (Account.annualInterestRate/100)/12;
    }

    public double getMonthlyInterest()
    {
        return this.balance*getMonthlyInterestRate();
    }

    public void withDraw (double amount)
    {
        this.balance = this.balance - amount;
    }

    public void deposit (double amount)
    {
        this.balance = this.balance + amount;
    }
}

public class Problem_7
{
    public static void main (String[] args)
    {
        Account a1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        a1.withDraw(2500);
        a1.deposit(3000);

        System.out.println ("Balance is: " + a1.getBalance());
        System.out.println ("Monthly interest is: " + a1.getMonthlyInterest());
        System.out.println("Date of account craetion is: " + a1.getDateCreated());
    }
}