// throw and throws part 5

class NegativeDimensionException extends Exception
{
    public String toString ()
    {
        return "Dimensions can't be Negative";
    }
}

public class Program_11
{
    static int area (int a, int b) throws NegativeDimensionException
    {
        if (a<0 || b<0)
        {
            throw new NegativeDimensionException();
        }
        return a*b;
    }

    static void meth1 () throws NegativeDimensionException
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
        catch (NegativeDimensionException e)
        {
            System.out.println(e.toString());
        }
    }
}