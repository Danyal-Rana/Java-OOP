import java.util.Scanner;

public class Program_10
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter a three digit number: ");

        int num = sc.nextInt();

        int sum = 0;

        int r = num%10;

        sum = sum + r;

        num = num/10;

        r = num%10;

        num = num/10;

        sum = sum + r + num;

        System.out.println (sum);

        sc.close();
    }
}