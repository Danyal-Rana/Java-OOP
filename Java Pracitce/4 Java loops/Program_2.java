public class Program_2
{
    public static void main(String[] args)
    {
        int i = 1;
        
        while (i<=36)
        {
            System.out.print (i);

            if (i%6==0)
            {
                System.out.println ();
            } else
            {
                System.out.print ("\t");
            }

            i++;
        }
    }
}