import java.util.*;

class Distance
{
    private int feet;
    private int inches;

    Distance ()
    {
        feet = 0;
        inches = 0;
        System.out.println ("Object has been created, Successfully.");
    }

    Distance (int feet, int inches)
    {
        if (feet>=0 && inches>=0)
        {
            this.feet = feet;
            if (inches > 11)
            {
                int feetCorrection = inches/12;
                this.feet = this.feet + feetCorrection;
                this.inches = inches%12;
            }
            else
            {
                this.inches = inches;
            }
        }
        else
        {
            this.feet = 0;
            this.inches = 0;
        }
        System.out.println ("Object has been created, Successfully.");
    }

    public void setFeet (int feet)
    {
        this.feet = feet;
    }

    public void setInches (int inches)
    {
        this.inches = inches;
    }

    int getFeet ()
    {
        return this.feet;
    }

    int getInches ()
    {
        return this.inches;
    }

    void display ()
    {
        System.out.println ("Distance is, " + this.feet + " Feet and " +this.inches+ " inches.");
    }
}

public class Task_3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Creating the object using Non-parameterized Constructor.");
        Distance d1 = new Distance();
        d1.display();

        System.out.println ();

        System.out.println ("Creating the object using Parameterized Constructor.");
        System.out.print ("Enter Feet: ");
        int myFeet = sc.nextInt();
        System.out.print ("Enter Inches: ");
        int myInches = sc.nextInt();

        Distance d2 = new Distance(myFeet, myInches);
        System.out.print ("Distane is, " + d2.getFeet() + " Feet and ");
        System.out.print (d2.getInches() + " inches.");

        sc.close();
    }
}
