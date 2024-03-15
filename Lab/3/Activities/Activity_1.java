class Circle
{
    private int radius;

    public Circle ()
    {
        radius = 7;
    }

    public Circle (int radius)
    {
        this.radius = radius;
    }

    public void setRadius (int radius)
    {
        this.radius = radius;
    }
    
    public int getRadius ()
    {
        return this.radius;
    }

    public void display ()
    {
        System.out.println ("Radius is: " + this.radius);
    }

    public double calculateCircumFerence ()
    {
        return 3.14*this.radius*this.radius;
    }
}

public class Activity_1
{
    public static void main (String[] args)
    {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println ("Circumference of Circle 1 is: " + c1.calculateCircumFerence());
        int r = c1.getRadius();

        Circle c2 = new Circle(r);
        c2.setRadius(10);
        System.out.println ("Circumference of Circle 2 is: " + c2.calculateCircumFerence());
    }
}