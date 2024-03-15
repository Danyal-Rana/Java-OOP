class Rectangle
{
    public int length, width;

    public int calculateArea ()
    {
        return length*width;
    }
}

public class Activity_1
{
    public static void main (String[] args)
    {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        System.out.println ("Area is: " + r1.calculateArea());
    }
}