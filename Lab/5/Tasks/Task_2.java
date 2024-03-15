class SavingsAccount
{
    public static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount ()
    {
        this.savingsBalance = 0;
    }

    public SavingsAccount (double savingBalance)
    {
        this.savingsBalance = savingBalance;
    }

    public static void setAnnualInterestRate (double x)
    {
        annualInterestRate = x;
    }

    public void setSavingsBalance (double savingBalance)
    {
        this.savingsBalance = savingBalance;
    }

    public double getSavingsBalance ()
    {
        return this.savingsBalance;
    }

    public double calculateMonthlyInterest ()
    {
        double temp = this.savingsBalance+(this.savingsBalance*annualInterestRate)/12;

        this.setSavingsBalance(temp);

        return temp;
    }

    public void display ()
    {
        System.out.println ("SavingsBalance of is: " + this.getSavingsBalance());
    }

}

public class Task_2
{
    public static void main (String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance (3000);

        System.out.println ("Month 1: ");
        SavingsAccount.setAnnualInterestRate(0.03);
        System.out.println ("Monthly interest of saver1 is: " + saver1.calculateMonthlyInterest());
        System.out.println ("Monthly interest of saver2 is: " + saver2.calculateMonthlyInterest());

        System.out.println ();

        System.out.println ("Month 2: ");
        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.println ("Monthly interest of saver1 is: " + saver1.calculateMonthlyInterest());
        System.out.println ("Monthly interest of saver2 is: " + saver2.calculateMonthlyInterest());
        
    }
}