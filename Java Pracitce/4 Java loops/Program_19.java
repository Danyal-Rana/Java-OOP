public class Program_19
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i=1; i<=97; i+=2)
        {
            for (int j=3; j<=99; j+=2)
            {
                sum = sum+(i/j);
            }
        }

        System.out.println ("The sum is: " + sum);
    }
}