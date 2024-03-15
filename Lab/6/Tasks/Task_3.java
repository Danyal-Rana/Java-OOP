class Point
{
    private double xCord;
    private double yCord;

    public Point () {}

    public Point (double xCord, double yCord)
    {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public void setXCord (double xCord)
    {
        this.xCord = xCord;
    }

    public void setYCord (double yCord)
    {
        this.yCord = yCord;
    }

    public double getXCord ()
    {
        return this.xCord;
    }

    public double getYCord ()
    {
        return this.yCord;
    }

    public void displayCords ()
    {
        System.out.println ("x-coordinate is: " +this.getXCord()+ "\ny-coordinate is: " +this.getYCord());
    }
}

class Line
{
    private Point startPoint;
    private Point endPoint;

    public Line () {}

    public Line (Point startPoint, Point endPoint)
    {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void setStartPoint (Point startPoint)
    {
        this.startPoint = startPoint;
    }

    public void setEndPoint (Point endPoint)
    {
        this.endPoint = endPoint;
    }

    public Point getStarPoint ()
    {
        return this.startPoint;
    }

    public Point getEndPoint ()
    {
        return this.endPoint;
    }

    public double lengthOfLine ()
    {
        return Math.sqrt(( (this.endPoint.getXCord()-this.startPoint.getXCord()) /2 ) + ( (this.endPoint.getYCord()-this.startPoint.getYCord()) /2 ));
    }

    public void displayLine ()
    {
        System.out.println ("*For the Starting Point*\nxCord is: " +this.startPoint.getXCord()+ "\nyCord is: " + this.startPoint.getYCord());

        System.out.println ("*For the Ending Point*\nxCord is: " +this.endPoint.getXCord()+ "\nyCord is: " + this.endPoint.getYCord());

        System.out.println ("Length is: " + this.lengthOfLine());
    }
}

public class Task_3
{
    public static void main (String[] args)
    {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(6, 8);
        Line l1 = new Line(p1, p2);
        System.out.println ("\nFor first line");
        l1.displayLine();

        Point p3 = new Point(10, 12);
        Point p4 = new Point(14, 16);
        Line l2 = new Line(p3, p4);
        System.out.println ("\nFor second line");
        l2.displayLine();
    }
}