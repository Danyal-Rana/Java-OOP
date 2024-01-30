import java.util.Scanner;

public class Program_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        

        System.out.print ("Enter the number till which you want the sum of even numbers: ");

        int sum, x, i;
        x = input.nextInt();
        sum = 0;
        input.close();

        for (i=0; i<=x; i+=2)
        {
            sum = sum + i;
        }

        System.out.println ("The sum of even numbers til " +x+ " is "+sum);
        
        
    }
}