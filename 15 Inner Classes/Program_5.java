interface My
{
    void display();
}

class Outer5
{
    void outerDisplay ()
    {
        My m = new My ()
        {
            public void display()
            {
                System.out.println("Hello, I am anonymous inner class.");
            }
        };
        m.display();
    }
}

public class Program_5
{
    public static void main (String[] args)
    {
        Outer5 o = new Outer5();
        o.outerDisplay();
    }
}