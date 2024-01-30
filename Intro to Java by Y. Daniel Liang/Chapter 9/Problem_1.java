class Rectangle
{
    double width;
    double height;

    Rectangle ()
    {
        width = 1;
        height = 1;
    }

    Rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    double getArea ()
    {
        return this.width*this.height;
    }

    double getPerimeter ()
    {
        return 2*(this.width+this.height);
    }
}

public class Problem_1
{
    public static void main (String[] args)
    {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println ("The width of 1st Rectangle is: " + r1.width);
        System.out.println ("The height of 1st Rectangle is: " + r1.height);
        System.out.println ("The area of 1st Rectangle is: " + r1.getArea());
        System.out.println ("The perimeter of 1st Rectangle is: " + r1.getPerimeter());

        System.out.println ();

        System.out.println ("The width of 2nd Rectangle is: " + r2.width);
        System.out.println ("The height of 2nd Rectangle is: " + r2.height);
        System.out.println ("The area of 2nd Rectangle is: " + r2.getArea());
        System.out.println ("The perimeter of 2nd Rectangle is: " + r2.getPerimeter());
    }
}