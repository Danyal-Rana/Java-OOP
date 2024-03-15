class Distance
{
    private int feet;
    private int inches;

    public Distance ()
    {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance (int feet, int inches)
    {
        this.feet = feet + inches/12;
        this.inches = inches%12;
    }

    public void setFeet (int feet)
    {
        this.feet = feet;
    }

    public void setInches (int inches)
    {
        this.setFeet (this.feet + inches/12);
        this.inches = inches%12;        
    }

    public int getFeet ()
    {
        return this.feet;
    }

    public int getInches ()
    {
        return this.inches;
    }

    public Distance add (Distance a)
    {
        Distance tempDistance = new Distance (a.feet+this.feet, a.inches+this.inches);
        return tempDistance;
    }

    public void display ()
    {
        System.out.println (this.feet + " feet and " + this.inches + " inches.");
    }
}

public class Task_1
{
    public static void main (String[] args)
    {
        Distance d1 = new Distance (5, 11);
        Distance d2 = new Distance (4, 13);

        Distance d3 = new Distance ();
        d3 = d1.add (d2);
        d3.display ();
    }
}