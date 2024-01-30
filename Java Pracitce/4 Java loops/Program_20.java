import java.util.*;

public class Program_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i=1; i<=num; i++)
        {
            factorial = factorial*i;
        }

        System.out.println ("The factorial of entered number " +num+ " is: " +factorial+ ".");

        sc.close();
    }
}