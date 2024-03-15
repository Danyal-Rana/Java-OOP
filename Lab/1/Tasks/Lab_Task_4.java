import java.util.*;

class Rectangle
{
    private double length;
    private double width;

    void settingData (double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    void getArea ()
    {
        System.out.println ("The Area of given Rectangle is: " + length*width);
    }

    void getPerimeter ()
    {
        System.out.println ("The perimeter of given Rectangle is: " + 2*(length+width));
    }
}

public class Lab_Task_4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        Rectangle r1 = new Rectangle();

        System.out.print ("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print ("Enter the width: ");
        double width = sc.nextDouble();

        r1.settingData(length, width);
        r1.getArea();
        r1.getPerimeter();

        sc.close();
    }
}
