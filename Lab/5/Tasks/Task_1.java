class Circle
{
    private int radius;
    public static int noOfCircle;

    public Circle ()
    {
        radius = 0;
        noOfCircle++;
    }

    public Circle (int radius)
    {
        this.radius = radius;
        noOfCircle++;
    }

    public void setRadius (int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public static void myCounter ()
    {
        System.out.println ("Circle class has " +noOfCircle+ " objects.");
    }
}

public class Task_1
{
    public static void main (String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(5);

        Circle.myCounter();
    }
}