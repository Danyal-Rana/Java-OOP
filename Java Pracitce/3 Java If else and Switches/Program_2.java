import java.util.*;

public class Program_2
{
    public static void main (String[] args)
    {
        Random rand = new Random();

        int monthNum = rand.nextInt(13);

        // System.out.println (monthNum);

        String monthName;

        switch (monthNum) {
            case 1:
            monthName = "January";
            break;

            case 2:
            monthName = "February";
            break;

            case 3:
            monthName = "March";
            break;

            case 4:
            monthName = "April";
            break;

            case 5:
            monthName = "May";
            break;

            case 6:
            monthName = "June";
            break;

            case 7:
            monthName = "July";
            break;

            case 8:
            monthName = "August";
            break;

            case 9:
            monthName = "September";
            break;

            case 10:
            monthName = "October";
            break;

            case 11:
            monthName = "November";
            break;

            default:
            monthName = "December";
            break;
        }

        System.out.println (monthName);
    }
}