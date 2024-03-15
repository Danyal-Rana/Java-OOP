abstract class Shape
{
    protected int totalLines;
    protected String penColor;
    protected String fillColor;

    public Shape () {}

    public Shape (int totalLines, String penColor, String fillColor)
    {
        this.totalLines = totalLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public void setTotalLines (int totalLines)
    {
        this.totalLines = totalLines;
    }

    public void setPenColor (String penColor)
    {
        this.penColor = penColor;
    }

    public void setFillColor (String fillColor)
    {
        this.fillColor = fillColor;
    }

    public int getTotalLines ()
    {
        return this.totalLines;
    }

    public String getPenColor ()
    {
        return this.penColor;
    }

    public String getFillColor ()
    {
        return this.fillColor;
    }

    public abstract void draw ();
}

class Circle extends Shape
{
    public Circle (int totalLines, String penColor, String fillColor)
    {
        super (totalLines, penColor, fillColor);
    }

    public void draw ()
    {
        System.out.println ("Circle has been drawn.");
    }
}

class Square extends Shape
{
    public Square (int totalLines, String penColor, String fillColor)
    {
        super (totalLines, penColor, fillColor);
    }

    public void draw ()
    {
        System.out.println ("Square has been drawn.");
    }
}

class Triangle extends Shape
{
    public Triangle (int totalLines, String penColor, String fillColor)
    {
        super (totalLines, penColor, fillColor);
    }

    public void draw ()
    {
        System.out.println ("Triangle has been drawn.");
    }
}

public class Task_3
{
    public static void main (String[] args)
    {
        Shape c = new Circle (1, "black", "white");
        Shape s = new Square (4, "black", "red");
        Shape t = new Triangle (3, "white", "yellow");

        c.draw();
        s.draw();
        t.draw();
    }
}
