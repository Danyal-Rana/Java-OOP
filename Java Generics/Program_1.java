public class Program_1
{
    public static void main (String[] args)
    {
        Object obj = new String ("Hi");

        // obj = new Integer(10);
        // there will be no error during compile time
        // this will cause runtime error
        // that's why we no longer use Object class for generalization

        String s = (String) obj;
    }
}