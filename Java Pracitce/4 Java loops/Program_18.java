import java.util.*;

public class Program_18
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int num2 = sc.nextInt();

        boolean Prime = false;

        int count = 0;

        for (int i=num1; i<=num2; i++)
        {
            for (int j=2; j<i; j++)
            {
                if (i%j == 0)
                {
                    Prime = false;
                    break;
                }
                else
                {
                    Prime = true;
                }
            }

            if (Prime == true)
            {
                System.out.print (i + ", ");
                count = count + 1;

                if (count % 8 == 0)
                {
                    System.out.println("");
                }
            }
        }
        sc.close();
    }
}