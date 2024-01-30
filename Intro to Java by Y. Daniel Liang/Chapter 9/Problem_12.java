import java.util.Scanner;

class Point
{
    private double x;
    private double y;

    public Point () {}

    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX (double x)
    {
        this.x = x;
    }

    public void setY (double y)
    {
        this.y = y;
    }

    public double getX ()
    {
        return this.x;
    }

    public double getY ()
    {
        return this.y;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}

class Line
{
    private Point startingPoint;
    private Point endingPoint;

    public Line () {}

    public Line (Point startingPoint, Point endingPoint)
    {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public void setStartingPoint (Point startingPoint)
    {
        this.startingPoint = startingPoint;
    }

    public void setEndingPoint (Point endingPoint)
    {
        this.endingPoint = endingPoint;
    }

    public Point getStartingPoint ()
    {
        return this.startingPoint;
    }

    public Point getEndingPoint ()
    {
        return this.endingPoint;
    }
}

class LinearEquation
{
    private double a,b,c,d,e,f;

    public LinearEquation () {}

    public LinearEquation (double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA ()
    {
        return this.a;
    }

    public double getB ()
    {
        return this.b;
    }

    public double getC ()
    {
        return this.c;
    }

    public double getD ()
    {
        return this.d;
    }

    public double getE ()
    {
        return this.e;
    }

    public double getF ()
    {
        return this.f;
    }

    public boolean isSolvable ()
    {
        return (this.a*this.d - this.b*this.c) != 0;
    }

    public double getX ()
    {
        return (this.e*this.d - this.b*this.f) / (this.a*this.d - this.b*this.c);
    }

    public double getY ()
    {
        return (this.a*this.f - this.e*this.c) / (this.a*this.d - this.b*this.c);
    }
}

public class Problem_12
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter x1 value for Point1: ");
        double x1 = sc.nextDouble();

        System.out.print ("Enter y1 value for Point1: ");
        double y1 = sc.nextDouble();

        System.out.print ("Enter x2 value for Point1: ");
        double x2 = sc.nextDouble();

        System.out.print ("Enter y2 value for Point1: ");
        double y2 = sc.nextDouble();

        System.out.print ("Enter x3 value for Point2: ");
        double x3 = sc.nextDouble();

        System.out.print ("Enter y3 value for Point2: ");
        double y3 = sc.nextDouble();

        System.out.print ("Enter x4 value for Point2: ");
        double x4 = sc.nextDouble();

        System.out.print ("Enter y4 value for Point2: ");
        double y4 = sc.nextDouble();

        Point p1 = new Point (x1, y1);
        Point p2 = new Point (x2, y2);
        Point p3 = new Point (x3, y3);
        Point p4 = new Point (x4, y4);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        double a = p1.getY() - p2.getY();
        double b = p2.getX() - p1.getX();
        double c = p3.getY() - p4.getY();
        double d = p4.getX() - p3.getX();
        double e = (p1.getY()-p2.getY())*p1.getX() - (p1.getX()-p2.getX())*p1.getY();
        double f = (p3.getY()-p4.getY())*p3.getX() - (p3.getX()-p4.getX())*p3.getY();

        LinearEquation eq = new LinearEquation (a, b, c, d, e, f);

        System.out.println ("Starting Point of Line 1 is: " + l1.getStartingPoint());
        System.out.println ("Ending Point of Line 1 is: " + l1.getEndingPoint());
        System.out.println ("Starting Point of Line 2 is: " + l2.getStartingPoint());
        System.out.println ("Ending Point of Line 2 is: " + l2.getEndingPoint());

        if (eq.isSolvable())
        {
            System.out.println ("The intersecting point is (" +eq.getX()+ ", " +eq.getY()+ ").");
        }
        else
        {
            System.out.println ("Two lines are parrallel and don't intersect.");
        }

        sc.close();
    }
}