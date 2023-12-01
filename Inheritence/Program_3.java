class Rectangle
{
    int length;
    int breadth;

    Rectangle ()
    {
        length = 1;
        breadth = 1;
    }

    Rectangle (int l, int b)
    {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle
{
    int height;

    Cuboid ()
    {
        height = 1;
    }

    Cuboid (int h)
    {
        height = h;
    }

    Cuboid (int l, int b, int h)
    {
        super(l, b);
        height = h;
    }

    public int volume ()
    {
        return length*breadth*height;
    }
}

public class Program_3
{
    public static void main (String[] args)
    {
        // Cuboid c = new Cuboid();
        // Cuboid c = new Cuboid(5);

        Cuboid c = new Cuboid(5, 10, 20);
        System.out.println ("Volume is: " + c.volume());
    }
}