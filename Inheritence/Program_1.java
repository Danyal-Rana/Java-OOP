class Circle
{
    public int radius;

    public double getArea ()
    {
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter ()
    {
        return 2*Math.PI*this.radius;
    }

    public double getCircumference ()
    {
        return this.getPerimeter();
    }
}

class Cylinder extends Circle
{
    public int height;

    public double getVolume ()
    {
        return this.getArea()*this.height;
    }
}

public class Program_1
{
    public static void main (String[] args)
    {
        Cylinder c = new Cylinder ();

        c.radius = 5;
        c.height = 10;

        System.out.println ("Area is: " + c.getArea());
        System.out.println ("Volume is: " + c.getVolume());
    }
}