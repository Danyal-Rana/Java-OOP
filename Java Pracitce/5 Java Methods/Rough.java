import java.util.*;

public class Rough
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter any number: ");
        int num = sc.nextInt();

        System.out.print ("The square of the entered number is: ");
        square(num);

        sc.close();
    }

    public static void square(int x)
    {
        int z = x*x;

        System.out.print (z);
    }
}