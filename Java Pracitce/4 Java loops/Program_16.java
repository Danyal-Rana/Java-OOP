import java.util.*;

public class Program_16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int num2 = sc.nextInt();

        int minNum = Math.min(num1, num2);

        int GCD = 1;

        for (int i=1; i<=minNum; i++)
        {
            if (num1%i==0 && num2%i==0)
            {
                GCD = i;
            }
            else
            {
                continue;
            }
        }
        
        System.out.println ("The greatest common divider is: " +GCD);

        sc.close();
    }
}