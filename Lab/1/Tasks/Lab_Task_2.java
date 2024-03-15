import java.util.*;

class Time
{
    int hour;
    int min;
    int sec;
    String meridies;

    void displayingTime ()
    {
        System.out.println (hour + " : " + min + " : " + sec + " " + meridies);
    }
}

public class Lab_Task_2
{
    public static void main (String[] args)
    {
        Time t1 = new Time();
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the hour: ");
        t1.hour = sc.nextInt();
        System.out.print ("Enter the minute: ");
        t1.min = sc.nextInt();
        System.out.print ("Enter the second: ");
        t1.sec = sc.nextInt();
        System.out.print ("Enter A.M or P.M: ");
        t1.meridies = sc.next();
        
        t1.displayingTime();
        sc.close();
    }
}
