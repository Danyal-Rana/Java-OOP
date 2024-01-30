import java.util.*;

public class Program_6
{
    static int myMethod (int x, int y)
    {
        int z = x*y;
        return z;
    }

    static float myMethod (float x, float y)
    {
        float z = x*y;
        return z;
    }

    static int myMethod (int x, int y, int xy)
    {
        int z = x*y*xy;
        return z;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print ("Enter the third number: ");
        int num3 = sc.nextInt();

        float a = num1;
        float b = num2;     

        System.out.println (myMethod(num1, num2));
        System.out.println (myMethod(a, b));
        System.out.println (myMethod(num1, num2, num3));

        sc.close();
    }
}