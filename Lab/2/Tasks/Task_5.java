import java.util.Scanner;

class Time
{
    private int hours;
    private int mins;
    private int secs;

    Time ()
    {
        this.hours = 00;
        this.mins = 00;
        this.secs = 00;

        System.out.println ("Object has been created, Succesfully.");
    }

    Time (int hours, int mins, int secs)
    {
        if (secs>=0)
        {
            this.secs = secs%60;
            int extraMin = secs/60;
            mins = mins + extraMin;
        }
        else
        {
            this.secs = 00;
        }

        if (mins>=0)
        {
            this.mins = mins%60;
            int extraHour = mins/60;
            hours = hours + extraHour;
        }
        else
        {
            this.mins = 00;
        }

        if (hours>=0)
        {
            this.hours = hours%24;
        }
        else
        {
            this.hours = 00;
        }

        System.out.println ("Object has been created, Succesfully.");
    }

    void display ()
    {
        String myStr;
        if (this.hours >=0 && this.hours<=11)
        {
            myStr = "AM";
        }
        else
        {
            myStr = "PM";
        }
        System.out.println ("Hours: " +this.hours+ ", Minutes: " +this.mins+ ", Seconds: " + this.secs + ", " + myStr);

        System.out.println (this.hours + " : " +this.mins+ " : " + this.secs + " " + myStr);
    }

    public void setHours (int hours)
    {
        this.hours = hours;
    }

    public void setMins (int mins)
    {
        this.mins = mins;
    }

    public void setSecs (int secs)
    {
        this.secs = secs;
    }

    public int getHours ()
    {
        return this.hours;
    }

    public int getMins ()
    {
        return this.mins;
    }

    public int getSecs ()
    {
        return this.secs;
    }
}

public class Task_5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println ("\nCreating the object using Non-parameterized constructor.");

        Time t1 = new Time();
        t1.display();

        System.out.println ("\nCreating the object using Parameterized constructor.");

        System.out.print ("Enter Hours: ");
        int hours = sc.nextInt();
        System.out.print ("Enter Minutes: ");
        int mins = sc.nextInt();
        System.out.print ("Enter Seconds: ");
        int secs = sc.nextInt();

        Time t2 = new Time(hours, mins, secs);
        t2.display();

        sc.close();
    }
}