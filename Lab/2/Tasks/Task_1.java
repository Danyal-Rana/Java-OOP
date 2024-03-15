import java.util.*;

class Circle
{
    private double radius;

    Circle ()
    {
        radius = 5;
    }

    Circle (double radius)
    {
        if (radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0;
        }
    }

    double circumference ()
    {
        return 2*Math.PI*radius;
    }

    public void setRadius (int radius)
    {
        this.radius = radius;
    }

    public double getRadius ()
    {
        return this.radius;
    }
};

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        Circle c1 = new Circle();

        System.out.print ("Enter the radius for c2: ");
        double r2 = sc.nextDouble();
        Circle c2 = new Circle(r2);

        System.out.println ("The circumference of c1 is: " + c1.circumference());
        System.out.println ("The circumference of c1 is: " + c2.circumference());

        sc.close();
    }
}