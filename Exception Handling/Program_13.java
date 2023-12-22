public class Program_13
{
    static void meth1 () throws Exception
    {
        throw new Exception();

        // System.out.println("Final Message");
        // can't print Final Message, nothing can be printed after exception is thrown
    }

    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
