class Fan
{
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan ()
    {
        this.speed = this.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan (int speed, boolean on, double radius, String color)
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed (int speed)
    {
        this.speed = speed;
    }

    public void setOn (boolean on)
    {
        this.on = on;
    }

    public void setRadius (double radius)
    {
        this.radius = radius;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public int getSpeed ()
    {
        return this.speed;
    }

    public boolean getOn ()
    {
        return this.on;
    }

    public double getRadius ()
    {
        return this.radius;
    }

    public String getColor ()
    {
        return this.color;
    }

    public String toString ()
    {
        if (this.on)
        {
            return "Speed is: " +this.getSpeed()+ ".\nColor is: " +this.getColor()+ ".\nRadius is: " +this.getRadius()+ ".";
        }
        return "Color is: " +this.getColor()+ ".\nRadius is: " +this.getRadius()+ ".\nFan is Off.";
    }
}

public class Problem_8
{
    public static void main (String[] args)
    {
        Fan f1 = new Fan();
        f1.setSpeed(f1.SLOW);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("yellow");
        System.out.println (f1.toString());

        System.out.println ();

        Fan f2 = new Fan();
        f2.setSpeed(f1.MEDIUM);
        f2.setOn(false);
        f2.setRadius(5);
        f2.setColor("blue");
        System.out.println (f2.toString());
    }
}