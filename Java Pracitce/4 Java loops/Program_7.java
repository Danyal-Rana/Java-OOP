import java.util.Scanner;

public class Program_7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number till which you want the factorial: ");
        int num = sc.nextInt();

        int f = 1;

        for (int i=1; i<=num; i++)
        {
            f = f*i;
        }

        System.out.println ("The factorial of "+ num + " is "+f);

        sc.close();
    }
}