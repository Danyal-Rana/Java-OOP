class Sample4
{
    final int min = 0;
    final static int normal;
    final int max;

    static
    {
        normal = 5;
    }

    Sample4 ()
    {
        max = 10;
    }
}

public class Program_4
{
    // final int b; #not allowed
    // b = 6;
    public static void main (String[] args)
    {
        final int a;
        a = 5;
    }
}
