public class Program_5
{
    public static void main(String[] args)
    {
        int product = 1;

        for (int i=2; i<=10; i+=2)
        {
            product = i*product;
        }

        System.out.println ("The product of even integars from 2 to 10 is: " + product);
    }
}