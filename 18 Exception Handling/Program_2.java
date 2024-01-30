public class Program_2
{
    public static void main (String[] args)
    {
        int []arr = {30, 10, 0};

        try
        {
            // int c = arr[0]/arr[1];
            int c = arr[0]/arr[2];

            System.out.println (c);

            System.out.println (arr[10]);
        }
        catch (ArithmeticException e)
        {
            // System.out.println (e);
            System.out.println ("Denominator can't be zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            // System.out.println(e);
            System.out.println ("Array has only 3 elements.");
        }

        System.out.println ("Program has been executed successfully");
    }
}