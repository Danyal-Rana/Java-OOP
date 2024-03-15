class Point
{
    private int x;
    private int y;

    public Point ()
    {
        x = 5;
        y = 15;
    }

    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public void display ()
    {
        System.out.println ("x-coordinate is: " + x + ". y-coordinate is: " + y);
    }

    public void movePoint (int a, int b)
    {
        x = x+a;
        y = y+b;
    }
}

public class Activity_3
{
    public static void main (String[] args)
    {
        Point p1 = new Point ();
        p1.movePoint(3, 5);
        p1.display();

        Point p2 = new Point (15, 5);
        p2.movePoint (5, 3);
        p2.display();
    }
}