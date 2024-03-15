class Calculator
{
    public static void sum (int x, int y)
    {
        System.out.println ("Sum is: " + (x+y));
    }

    public static void multiply (int x, int y)
    {
        System.out.println ("Product is: " + (x*y));
    }

    public static int product (int x, int y)
    {
        return x/y;
    }

    public static int modulus (int x, int y)
    {
        return x%y;
    }

    public static void sin (double x)
    {
        x = Math.toRadians(x);
        System.out.println ("Math.sin is: " + Math.sin(x));
    }

    public static void cos (double x)
    {
        x = Math.toRadians(x);
        System.out.println ("Math.cos is: " + Math.cos(x));
    }

    public static void tan (double x)
    {
        x = Math.toRadians(x);
        System.out.println ("Math.tan is: " + Math.tan(x));
    }
}

public class Task_3
{
    public static void main (String[] args)
    {
        Calculator.sum (12 , 5);
        Calculator.multiply (12, 5);

        System.out.println ("Division: " + Calculator.product(12, 5));
        System.out.println ("Modulus is: " + Calculator.product(12, 5));

        Calculator.sin (90);
        Calculator.cos (90);
        Calculator.tan (90);
    }
}