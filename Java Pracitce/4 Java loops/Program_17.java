import java.util.*;

public class Program_17
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter any positive integar: ");

        int num = sc.nextInt();

        for (int i=2; i<num; i++)
        {
            if (num%i==0)
            {
                System.out.print (i + ",");
            }
        }

        sc.close();
    }
}