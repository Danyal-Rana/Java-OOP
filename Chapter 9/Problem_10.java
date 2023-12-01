import java.util.*;

class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation ()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA ()
    {
        return this.a;
    }

    public double getB ()
    {
        return this.b;
    }

    public double getC ()
    {
        return this.c;
    }

    public double getDiscriminant ()
    {
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1 ()
    {
        if (this.getDiscriminant() >= 0)
        {
            return (-this.b + Math.sqrt(this.getDiscriminant())) / 2*this.a;
        }
        else
        {
            return 0;
        }
    }

    public double getRoot2 ()
    {
        if (this.getDiscriminant() >= 0)
        {
            return (-this.b - Math.sqrt(this.getDiscriminant())) / 2*this.a;
        }
        else
        {
            return 0;
        }
    }
}

public class Problem_10
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print ("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print ("Enter the value of c: ");
        double c = sc.nextDouble();

        QuadraticEquation Eq1 = new QuadraticEquation(a, b, c);

        if (Eq1.getDiscriminant() == 0)
        {
            System.out.println ("Root is: " + Eq1.getRoot1());
        }
        else if (Eq1.getDiscriminant() < 0)
        {
            System.out.println ("The equation has no roots.");
        }
        else
        {
            System.out.println ("First root is: " + Eq1.getRoot1());
            System.out.println ("Second root is: " + Eq1.getRoot2());
        }

        sc.close();
    }
}