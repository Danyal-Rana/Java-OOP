class Rectangle
{
    private int length;
    private int width;

    public Rectangle ()
    {
        length = 5;
        width = 2;
    }

    public Rectangle (int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    public void setWidth (int width)
    {
        this.width = width;
    }

    public int getLength ()
    {
        return this.length;
    }

    public int getWidth ()
    {
        return this.width;
    }

    public int areaOfRectangle ()
    {
        return this.length*this.width;
    }
}

public class Activity_2
{
    public static void main (String[] args)
    {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);

        System.out.println ("The length of Rectangle is: " + rect.getLength());
        System.out.println ("The width of Rectangle is: " + rect.getWidth());
        System.out.println ("The Area of Rectangle is: " + rect.areaOfRectangle());
    }
}
