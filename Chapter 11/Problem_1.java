import java.util.*;

class GeometricObject
{
    private String color;
    private boolean filled;

    public GeometricObject ()
    {
        this.color = "white";
        this.filled = true;
    }

    public GeometricObject (String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public void setFilled (boolean filled)
    {
        this.filled = filled;
    }

    public String getColor ()
    {
        return this.color;
    }

    public boolean getFilled ()
    {
        return this.filled;
    }

    public String toString ()
    {
        return "Color is: " +this.color+ "\nIs Filled: " +this.getFilled();
    }
}

class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle ()
    {
        this.side1 = this.side2 = this.side3 = 1;
    }

    public Triangle (double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle (String color, boolean filled, double side1, double side2, double side3)
    {
        super (color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1 (double side1)
    {
        this.side1 = side1;
    }

    public void setSide2 (double side2)
    {
        this.side2 = side2;
    }

    public void setSide3 (double side3)
    {
        this.side3 = side3;
    }

    public double getSide1 ()
    {
        return this.side1;
    }

    public double getSide2 ()
    {
        return this.side2;
    }

    public double getSide3 ()
    {
        return this.side3;
    }

    public double getArea ()
    {
        double s = (side1+side2+side3)/2;
        double area = s*(s-side1)*(s-side2)*(s-side3);
        area = Math.sqrt(area);

        return area;
    }

    public double getPerimeter ()
    {
        return side1+side2+side3;
    }

    public String toString ()
    {
        return super.toString()+ "\nSide 1 is: " +this.side1+ "\nSide 2 is: " +this.side2+ "\nSide 3 is: " +this.side3+ "\nArea is: " +this.getArea()+ "\nPerimter is: " + this.getPerimeter();
    }
}

public class Problem_1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter color: ");
        String c = sc.next();
        System.out.print ("Is filled (true/false): ");
        boolean f = sc.nextBoolean();

        System.out.print ("Enter side 1 of triangle: ");
        double s1 = sc.nextDouble();
        System.out.print ("Enter side 2 of triangle: ");
        double s2 = sc.nextDouble();
        System.out.print ("Enter side 3 of triangle: ");
        double s3 = sc.nextDouble();

        Triangle t1 = new Triangle(c, f, s1, s2, s3);

        System.out.println (t1.toString());

        sc.close();
    }
}