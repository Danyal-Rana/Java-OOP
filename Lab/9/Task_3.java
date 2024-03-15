import java.util.Scanner;

abstract class Convert
{
    protected double val1;
    protected double val2;

    public Convert () {}

    public Convert (double val1)
    {
        this.val1 = val1;
    }

    public void setVal1 (double val1)
    {
        this.val1 = val1;
    }

    public double getVal1 ()
    {
        return this.val1;
    }

    abstract void compute ();

    abstract double getVal2 ();
}

class l_to_g extends Convert
{
    public l_to_g (double val1)
    {
        super (val1);
    }

    void compute ()
    {
        this.val2 = val1*0.264172;
    }

    double getVal2 ()
    {
        return this.val2;
    }
}

class f_to_c extends Convert
{
    public f_to_c (double val1)
    {
        super (val1);
    }

    void compute ()
    {
        this.val2 = (val1-32) * ((double) 5 /9);
    }

    double getVal2 ()
    {
        return this.val2;
    }
}

class f_to_m extends Convert
{
    public f_to_m (double val1)
    {
        super (val1);
    }

    void compute ()
    {
        this.val2 = val1 * 0.3048;
    }

    double getVal2 ()
    {
        return this.val2;
    }
}

public class Task_3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the quantity in liters: ");
        double a = sc.nextDouble();
        l_to_g l1 = new l_to_g(a);
        l1.compute();
        System.out.println ("Gallons are: " + l1.getVal2());


        System.out.print ("\nEnter the temperature in Farenheit: ");
        double b = sc.nextDouble();
        f_to_c temp = new f_to_c(b);
        temp.compute();
        System.out.println ("Celsius: " + temp.getVal2());


        System.out.print ("\nEnter total feet: ");
        double c = sc.nextDouble();
        f_to_m meters = new f_to_m(c);
        meters.compute();
        System.out.println ("Meters: " + meters.getVal2());

        sc.close();
    }
}