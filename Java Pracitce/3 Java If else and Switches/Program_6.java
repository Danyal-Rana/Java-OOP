import java.util.*;

public class Program_6
{
    public static void main (String[] args)
    {

        Random rand = new Random();

        int sides = rand.nextInt(2 - 0) + 0;

        System.out.println (sides);

        Scanner sc = new Scanner(System.in);

        System.out.print ("Coin side (Enter 0 for Head and 1 for Tail): ");
        int num = sc.nextInt();

        if (num==0 || num == 1)
        {
            if (num==sides)
            {
                System.out.println ("Your guess is correct");
            }
            else
            {
                System.out.println ("Your guess is incorrect.");
            }
        }
        else
        {
            System.out.println ("You entered the wrong Input.");
        }

        sc.close();
    }
}