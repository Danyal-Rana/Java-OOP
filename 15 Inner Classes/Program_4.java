abstract class My1
{
    abstract void display();
}

class Outer4
{
    void outerDisplay ()
    {
        My1 m = new My1 ()
        {
            void display()
            {
                System.out.println("Hello, I am anonymous inner class.");
            }
        };
        m.display();
    }
}

public class Program_4
{
    public static void main (String[] args)
    {
        Outer4 o = new Outer4();
        o.outerDisplay();
    }
}