import java.util.*;

public class Program_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the Year: ");
        int year = sc.nextInt();

        System.out.print ("Enter the first Day of the year: ");
        int day = sc.nextInt();

        String dayName = "Monday";

        switch (day)
        {
            case 1:
            dayName = "Monday";
            break;

            case 2:
            dayName = "Tuesday";
            break;

            case 3:
            dayName = "Wednesday";
            break;

            case 4:
            dayName = "Thursday";
            break;

            case 5:
            dayName = "Friday";
            break;

            case 6:
            dayName = "Saturday";
            break;

            case 7:
            dayName = "Sunday";
        }

        int monthNum = 1;

        String month = "January";

        switch (monthNum)
        {
            case 1:
            month = "January";
            break;

            case 2:
            month = "February";
            break;

            case 3:
            month = "March";
            break;

            case 4:
            month = "April";
            break;

            case 5:
            month = "May";
            break;

            case 6:
            month = "June";
            break;

            case 7:
            month = "July";
            break;

            case 8:
            month = "August";
            break;

            case 9:
            month = "September";
            break;

            case 10:
            month = "October";
            break;

            case 11:
            month = "November";
            break;

            case 12:
            month = "Deceomber";
        }

        System.out.println (month +" 1, "+ "of " +year+ " is " + dayName + ".");

        sc.close();
    }
}