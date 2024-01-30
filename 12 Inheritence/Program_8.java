class Class_1
{
    protected void display ()
    {
        System.out.println("Parent class.");
    }
}

class Class_2 extends Class_1
{
    public void display ()
    {
        System.out.println("Child class.");
    }
}

public class Program_8
{
    public static void main (String[] args)
    {
        Class_1 c = new Class_2();

        c.display();
    }
}