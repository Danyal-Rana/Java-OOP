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

public class Program_5
{
    public static void main(String[] args)
    {
        SuperClass obj = new SubClass ();
        obj.display();
    }
}