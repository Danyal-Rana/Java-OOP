interface Shape
{
    double getArea ();
}

class Circle implements Shape
{
    private double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public void setRadius (double radius)
    {
        this.radius = radius;
    }

    public double getRadius ()
    {
        return this.radius;
    }

    public double getArea ()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Rectangle implements Shape
{
    private double width;
    private double height;

    public Rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public void setWidth (double width)
    {
        this.width = width;
    }

    public void setHeight (double height)
    {
        this.height = height;
    }

    public double getWidth ()
    {
        return this.width;
    }

    public double getHeight ()
    {
        return this.height;
    }

    public double getArea ()
    {
        return this.width * this.height;
    }
}

public class Task_1
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);

        double circleArea = circle.getArea();
        System.out.println("Circle Area: " + circleArea);

        double rectangleArea = rectangle.getArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        circle.setRadius(7.0);
        rectangle.setWidth(5.0);
        rectangle.setHeight(6.0);

        double updatedCircleArea = circle.getArea();
        double updatedRectangleArea = rectangle.getArea();

        System.out.println("Updated Circle Area is: " + updatedCircleArea);
        System.out.println("Updated Rectangle Area is: " + updatedRectangleArea);
    }
}