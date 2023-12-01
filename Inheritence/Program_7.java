class Class_1
{
    public void m1 ()
    {
        System.out.println("Method 1 of Parent Class");
    }

    public void m2 ()
    {
        System.out.println("Mehtod 2 of Parent Class");
    }
}

class Class_2 extends Class_1
{
    public void m2 ()
    {
        System.out.println("Method 2 of Child Class");
    }

    public void m3 ()
    {
        System.out.println("Method 3 of Child Class");
    }
}

public class Program_7
{
    public static void main(String[] args)
    {
        Class_1 c = new Class_2();
        c.m1();
        c.m2();
    }
}