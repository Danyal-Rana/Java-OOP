import java.util.Scanner;

public class Program_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the number: ");
        int num = sc.nextInt();

        for (int i=num; i>=0.1; i=i/10)
        {
            int r = i%10;
            System.out.print (r);
        }

        sc.close();
    }
}