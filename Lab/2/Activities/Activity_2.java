class Rectangle
{
    public int length, width;

    public Rectangle ()
    {
        length = 10;
        width = 5;
    }

    public Rectangle (int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int calculateArea ()
    {
        return length*width;
    }
}

public class Activity_2
{
    public static void main (String[] args)
    {
        Rectangle r1 = new Rectangle ();
        System.out.println ("Area of Rectangle r1 (created, using non-parameterized constructor) is: " + r1.calculateArea());

        Rectangle r2 = new Rectangle (20, 10);
        System.out.println ("Area of Rectangle r2 (created, using non-parameterized constructor) is: " + r2.calculateArea());
    }
}