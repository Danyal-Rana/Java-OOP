class RegularPolygon
{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon ()
    {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon (int n, double side)
    {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon (int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN ()
    {
        return this.n;
    }

    public double getSide ()
    {
        return this.side;
    }

    public double getX ()
    {
        return this.x;
    }

    public double getY ()
    {
        return this.y;
    }

    public void setN (int n)
    {
        this.n = n;
    }

    public void setSide (double side)
    {
        this.side = side;
    }

    public void setX (double x)
    {
        this.x = x;
    }

    public void setY (double y)
    {
        this.y = y;
    }

    public double getPerimeter ()
    {
        return this.n * this.side;
    }

    public double getArea ()
    {
        return (this.n * this.side * this.side) / (4  * Math.tan(Math.PI/this.n));
    }
}

public class Problem_9
{
    public static void main (String[] args)
    {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println ("For the first polygon, the Area is: " +p1.getArea()+ ", and the Perimeter is: " + p1.getPerimeter()+ ".\n");

        System.out.println ("For the second polygon, the Area is: " +p2.getArea()+ ", and the Perimeter is: " + p2.getPerimeter()+ ".\n");

        System.out.println ("For the third polygon, the Area is: " +p3.getArea()+ ", and the Perimeter is: " + p3.getPerimeter()+ ".\n");
    }
}