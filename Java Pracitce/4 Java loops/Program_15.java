public class Program_15
{
    public static void main (String[] args)
    {
        int count = 0;
        for (int i=100; i<=1000; i++)
        {
            if (i%3==0 || i%4==0)
            {
                System.out.print (i + " ");
                count = count + 1;
            }
            if (count%10==0)
            {
                System.out.println ("");
            }
        }
    }
}