class Outer3
{
    void display()
    {
        class Inner
        {
            void display ()
            {
                System.out.println("Hello, I am local Inner class to display method of Outer3 class.");
            }
        }

        Inner i = new Inner();
        i.display();
    }
}

public class Program_3
{
    public static void main (String[] args)
    {
        Outer3 o = new Outer3();
        o.display();
    }
}
