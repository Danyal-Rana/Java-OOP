import java.util.Scanner;

public class Program_1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter first number: ");
        int a = sc.nextInt();

        System.out.print ("Enter second number: ");
        int b = sc.nextInt();

        try
        {
            int c = a/b;
            System.out.println (c);
        }
        catch (ArithmeticException e)
        {
            // System.out.println (e);
            System.out.println ("Denominator can't be zero");
        }

        System.out.println ("Program has been executed successfully");

        sc.close();
    }
}