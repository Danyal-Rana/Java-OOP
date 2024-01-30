import java.util.Scanner;

public class Program_6
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter a number (1-100): ");
        long num = inp.nextLong();

        System.out.println ("Number     Sum");
        long sum=0;

        if (num>0 && num<=100)
        {

            for (int i=1; i<=num; i++)
            {
                sum = sum+i;
                System.out.println (i+ "\t " +sum);
            }
        }
        else
        {
            System.out.println ("Entered number is invalid.");
        }
        inp.close();
    }
}