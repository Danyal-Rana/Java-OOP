// throw and throws part 4

public class Program_10
{
    static int area (int a, int b) throws Exception
    {
        if (a<0 || b<0)
        {
            throw new Exception();
        }
        return a*b;
    }

    static void meth1 () throws Exception
    {
        System.out.println(area(-10, 5));
    }

    public static void main (String[] args)
    {
        // main method is handling the error of area method
        try
        {
            meth1();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}