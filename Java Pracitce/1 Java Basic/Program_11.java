import java.util.Scanner;

public class Program_11
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the initial velocity: ");
        float initialVelocity = sc.nextFloat();

        System.out.print ("Enter the final velocity: ");
        float finalVelocity = sc.nextFloat();

        System.out.print ("Enter the time taken: ");
        float timeTaken = sc.nextFloat();

        float acceleration = (finalVelocity - initialVelocity) / timeTaken;

        System.out.println ("The acceleration is: " + acceleration + " m/sec2");

        sc.close();

    }
}