class Fraction
{
    private int p;
    private int q;

    public Fraction ()
    {
        this.p = 0;
        this.q = 0;
    }

    public Fraction (int p, int q)
    {
        this.p = p;
        this.q = q;
    }

    public void setP (int p)
    {
        this.p = p;
    }

    public void setQ (int q)
    {
        this.q = q;
    }

    public int getP ()
    {
        return this.p;
    }

    public int getQ ()
    {
        return this.q;
    }

    public boolean areEqual (Fraction a)
    {
        if (this.p == a.p && this.q == a.q)
        {
            return true;
        }
        return false;
    }

    public void display ()
    {
        System.out.println ("P is " +this.p+ " and Q is " +this.q);
    }
}

public class Task_3
{
    public static void main (String [] args)
    {
        Fraction f1 = new Fraction ();
        f1.setP (5);
        f1.setQ (10);
        Fraction f2 = new Fraction (5, 10);

        if (f1.areEqual(f2))
        {
            System.out.println ("Both fractions are Equal.");
        }
        else
        {
            System.out.println ("Both fractins are Not equal.");
        }
    }
}