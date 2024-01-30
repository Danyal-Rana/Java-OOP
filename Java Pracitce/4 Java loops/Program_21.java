import java.util.*;

public class Program_21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the starting year: ");
        int sYear = sc.nextInt();

        System.out.print ("Enter the ending year: ");
        int eYear = sc.nextInt();

        int count = 0;

        for (int i = sYear; i<=eYear; i++)
        {
            if ((i%4==0 && i%100 !=0) || (i%400 == 0))
            {
                System.out.print (i + " ");
                count = count + 1;
            }
            if (count%5 == 0)
            {
                System.out.println ("");
            }
        }

        sc.close();
    }
}