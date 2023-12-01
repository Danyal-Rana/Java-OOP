class Sample
{
    static int x = 10;

    void show ()
    {
        System.out.println(x);
    }

    static void display ()
    {
        System.out.println(x);
    }
}

public class Program_1
{
    public static void main (String[] args)
    {
        Sample.display();

        Sample s1 = new Sample();
        s1.show();
        s1.display();
    }
}