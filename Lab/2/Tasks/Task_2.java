import java.util.*;

class Account
{
    double balance;

    Account ()
    {
        balance = 0;
        System.out.println ("Object has been created, Successfully.");
    }

    Account (double balance)
    {
        if (balance > 0)
        {
            this.balance = balance;
        }
        else
        {
            balance = 0;
        }
        System.out.println ("Object has been created, Successfully.");
    }

    void setBalance (double newBalance)
    {
        this.balance = newBalance;
    }

    void withdraw (double amount)
    {
        if (this.balance >= amount)
        {
            double newB = this.balance-amount;
            setBalance(newB);

            System.out.println ("Rs: " +amount+ " has been deducted.\nYour new Balance is Rs: " +newB+ ".");
        }
        else
        {
            System.out.println ("Insufficient Balance !");
        }
    }

    void deposit (double amount)
    {
        double newB = this.balance + amount;
        setBalance(newB);

        System.out.println ("Rs: " +amount+ " has been deposited. \nYour new Balance is Rs: " + newB + ".");
    }

    void display ()
    {
        System.out.println ("Your current balance is: " + this.balance);
    }
}

public class Task_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("We are going to create your Account throught Non-Parameterized constructor and using setter. Enter the initial amount: ");
        double b1 = sc.nextDouble();
        Account a1 = new Account ();
        a1.setBalance(b1);
        a1.display();

        System.out.println ();

        System.out.print ("We are going to create your Account throught Parameterized constructor. Enter the initial amount: ");
        double initialBalance = sc.nextDouble();
        Account a2 = new Account(initialBalance);
        a2.display();

        System.out.println ();

        System.out.print ("Enter the amount you want to deposit: ");
        double newAmount = sc.nextDouble();
        a2.deposit(newAmount);

        System.out.println ();

        System.out.print ("Enter the amount you want to withdraw: ");
        double wAmount = sc.nextDouble();
        a2.withdraw(wAmount);


        sc.close();
    }
}
