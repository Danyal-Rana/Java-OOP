class Point
{
    private int x;
    private int y;

    public Point ()
    {
        this.x = 5;
        this.y = 6;
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

    public int getX ()
    {
        return this.x;
    }

    public int getY ()
    {
        return this.y;
    }

    public Point add (Point pA, Point pB)
    {
        Point p_new = new Point (this.x+pA.x+pB.x, this.y+pA.y+pB.y);

        return p_new;
    }

    public void display ()
    {
        System.out.println ("X: " + this.x);
        System.out.println ("Y: " + this.y);
    }
}

public class Activity_3
{
    public static void main (String[] args)
    {
        Point p1 = new Point (10, 20);
        Point p2 = new Point (30, 40);
        Point p3 = new Point ();

        Point p4 = p1.add(p2, p3);
        p4.display();
    }
}