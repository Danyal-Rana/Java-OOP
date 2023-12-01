class SuperClass
{
    public void display ()
    {
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass
{
    public void display ()
    {
        System.out.println("Sub Class");
    }
}

public class Program_4
{
    public static void main(String[] args)
    {
        SuperClass super1 = new SuperClass();
        super1.display();

        SubClass sub1 = new SubClass();
        sub1.display();
    }
}