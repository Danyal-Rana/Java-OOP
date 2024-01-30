import java.util.*;

public class Program_5
{
    static int basicMath (int x, int i)
    {
        int z = x*i;
        return z;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter a number: ");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++)
        {
            int y = basicMath(num , i);
            System.out.println (num + " X " + i + " = " + y);
        }
        
        sc.close();
    }
}