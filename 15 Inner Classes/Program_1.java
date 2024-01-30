class Outer
{
    int x = 10;

    class Inner
    {
        int y = 20;

        void display ()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void display()
    {
        Inner i = new Inner();
        i.display();
        System.out.println(i.y);
    }
}

public class Program_1
{
    public static void main (String[] args)
    {
        Outer o = new Outer();
        o.display();
    }
}