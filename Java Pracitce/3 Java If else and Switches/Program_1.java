import java.util.Scanner;

public class Program_1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the value of a: ");
        float a = sc.nextFloat();

        System.out.print ("Enter the value of b: ");
        float b = sc.nextFloat();

        System.out.print ("Enter the value of c: ");
        float c = sc.nextFloat();

        // here is the error
        float discriminant = (float) (Math.pow(b, 2)) - (4*a*c);
        discriminant = (float) Math.pow(discriminant, 0.5);

        if (discriminant == 0)
        {
            float root = -b/ (2*a);
            System.out.println ("The only real Root of the equation is: " + root);
        }
        else if (discriminant < 0)
        {
            System.out.println ("The equation has no real roots as the Discriminant is negative.");
        }
        else
        {
            float root1 = (-b+discriminant) / (2*a);
            float root2 = (-b-discriminant) / (2*a);

            System.out.println ("The Root 1 is: " + root1);
            System.out.println ("The Root 2 is: " + root2);
        }
        
        sc.close();
    }
}