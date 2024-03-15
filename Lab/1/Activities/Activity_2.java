class Date
{
    public String month;
    public int day;
    public int year;

    public void display ()
    {
        System.out.println (month + " " + day + ", " + year);
    }
}
public class Activity_2
{
    public static void main (String[] args)
    {
        Date date1, date2;
        date1 = new Date();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2002;
        date1.display();
        
        date2 = new Date();
        date2.month = "September";
        date2.day = 6;
        date2.year = 2023;
        date2.display();
        
    }
}
