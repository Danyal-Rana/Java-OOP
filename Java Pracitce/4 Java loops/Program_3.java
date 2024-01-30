public class Program_3
{
    public static void main(String[] args)
    {
        
        for (int i=1; i<=36; i++)
        {
            System.out.print (i);

            if (i%6==0)
            {
                System.out.println ();
            } else
            {
                System.out.print ("\t");
            }
        }
    }
}