class Simple
{
    protected int num1;
    protected int num2;

    public Simple () {}

    public Simple (int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1 (int num1)
    {
        this.num1 = num1;
    }

    public void setNum2 (int num2)
    {
        this.num2 = num2;
    }

    public int getNum1 ()
    {
        return this.num1;
    }

    public int getNum2 ()
    {
        return this.num2;
    }

    public void add ()
    {
        System.out.println("Addition: " + (this.num1 + this.num2));
    }

    public void sub ()
    {
        System.out.println("Subtraction: " + (this.num1 - this.num2));
    }

    public void mul ()
    {
        System.out.println("Multiplying: " + (this.num1 * this.num2));
    }

    public void div ()
    {
        System.out.println("Division: " + (this.num1 / this.num2));
    }
}

class VerifiedSimple extends Simple
{
    public VerifiedSimple () {}

    public VerifiedSimple (int num1, int num2)
    {
        super (num1, num2);
    }

    public void add ()
    {
        if (this.getNum1() > 0 && this.getNum2() > 0)
        {
            System.out.println("Addition: " + (this.num1 + this.num2));
        }
        else
        {
            System.out.println ("Error, numbers are less than or equal to 0");
        }
    }

    public void sub ()
    {
        if (this.num1 > 0 && this.num2 > 0)
        {
            System.out.println("Subtraction: " + (this.num1 - this.num2));
        }
        else
        {
            System.out.println ("Error, numbers are less than or equal to 0");
        }
    }

    public void mul ()
    {
        if (this.num1 > 0 && this.num2 > 0)
        {
            System.out.println("Multiplication: " + (this.num1 * this.num2));
        }
        else
        {
            System.out.println ("Error, numbers are less than or equal to 0");
        }
    }

    public void div ()
    {
        if (this.num1 > 0 && this.num2 > 0)
        {
            System.out.println("Division: " + (this.num1 / this.num2));
        }
        else
        {
            System.out.println ("Error, numbers are less than or equal to 0");
        }
    }


}

public class Task_2
{
    public static void main (String[] args)
    {
        Simple s1 = new VerifiedSimple (4, 2);
        VerifiedSimple s2 = new VerifiedSimple (0, 4);

        System.out.println ("*** For the s1 ***");
        s1.add();
        s1.sub();
        s1.mul();
        s1.div();

        System.out.println ("\n*** For the s2 ***");
        s2.add();
        s2.sub();
        s2.mul();
        s2.div();
    }
}
