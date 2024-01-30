import java.util.*;

public class Program_5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter a 3 digit number: ");
        int num = sc.nextInt();

        if (num<=999)
        {
            int d3 = num%10;
            int d1 = num/100;

            if (d1 == d3)
            {
                System.out.println (num + " is a Palindrome.");
            }
            else
            {
                System.out.println (num + " is not a Palindrome.");
            }
        }

        else
        {
            System.out.println ("You entered the wrong Input.");
        }

        sc.close();
    }
}