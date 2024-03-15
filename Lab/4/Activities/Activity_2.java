class Complex
{
    private double real;
    private double imag;

    public Complex ()
    {
        this.real = 0;
        this.imag = 0;
    }

    public Complex (double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public Complex add (Complex b)
    {
        Complex c_new = new Complex (this.real+b.real, this.imag+b.imag);

        return c_new;
    }

    public void show ()
    {
        System.out.println ("Real part is: " + this.real);
        System.out.println ("Imaginary part is: " + this.imag);
    }
}

public class Activity_2
{
    public static void main (String[] args)
    {
        Complex c1 = new Complex (11, 2.3);
        Complex c2 = new Complex (9, 2.3);

        Complex c3 = new Complex ();
        c3 = c1.add(c2);
        c3.show();
    }
}