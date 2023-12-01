abstract class Shape
{
    abstract double calculatePerimiter () ;

    abstract double calculateArea () ;
}

class Circle extends Shape
{
    private double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public double calculatePerimiter ()
    {
        return 2*Math.PI*radius;
    }

    public double calculateArea ()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape
{
    private double length;
    private double breadth;

    public Rectangle (double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatePerimiter ()
    {
        return 2*(length+breadth);
    }

    public double calculateArea ()
    {
        return length*breadth;
    }
}

public class Program_3
{
    public static void main (String[] args)
    {
        Shape c = new Circle (5);
        System.out.println ("The area of circle is: " + c.calculateArea());
        System.out.println ("The perimeter of circle is: " + c.calculatePerimiter());

        Shape r = new Rectangle(5, 10);
        System.out.println ("\nThe area of rectangle is: " + r.calculateArea());
        System.out.println ("The perimeter of rectangle is: " + r.calculatePerimiter());
    }
}