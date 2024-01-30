import java.util.Scanner;

public class Program_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("How many integars do you want to enter: ");
        int total_int = sc.nextInt();

        int even_sum = 0;
        int odd_sum = 0;

        for (int i=1; i<= total_int; i++)
        {
            System.out.print ("Enter the integar number: ");
            int num = sc.nextInt();

            if (num%2==0)
            {
                even_sum = even_sum + num;
            }
            else
            {
                odd_sum = odd_sum + num;
            }
        }

        System.out.println ("The sum of even integars is " +even_sum+ ".");
        System.out.println ("The sum of odd integars is " +odd_sum+ ".");

        sc.close();
    }
}