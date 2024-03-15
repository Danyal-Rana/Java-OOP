class Point
{
    private int x;
    private int y;

    public Point ()
    {
        this.x = 0;
        this.y = 0;
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

    public void displayPoint ()
    {
        System.out.println ("x-cordinate is: " + this.x);
        System.out.println ("y-cordinate is: " + this.y);
    }

    public void movePoint (int x, int y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }

}

public class Activity_3
{
    public static void main (String[] args)
    {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(7);
        p1.displayPoint();

        System.out.println ();

        Point p2 = new Point(10, 11);
        p2.movePoint(2, 3);
        p2.displayPoint();
    }
}
