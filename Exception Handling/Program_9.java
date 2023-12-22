// throw and throws part 3

public class Program_9
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
        System.out.println(area(-20, 5));
    }

    public static void main (String[] args) throws Exception // main is throwing the error to jvm
    {
        meth1();
    }
}