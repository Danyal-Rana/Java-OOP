class Outer6
{
    int x = 10;
    static int y = 20;

    static class Inner
    {
        void display ()
        {
            System.out.println(y);
        }
    }
}

public class Program_6
{
    public static void main(String[] args)
    {
        Outer6.Inner i = new Outer6.Inner();
        i.display();
    }
}
