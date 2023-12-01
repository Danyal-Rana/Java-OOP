class Outer1
{
    int x = 10;
    Inner1 i = new Inner1();

    class Inner1
    {
        int y = 20;

        void display ()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay()
    {
        i.display();
        System.out.println(i.y);
    }
}

public class Program_2
{
    public static void main (String[] args)
    {
        Outer1.Inner1 i = new Outer1().new Inner1();

        i.display();
    }
}