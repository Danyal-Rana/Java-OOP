import java.util.*;

public class Program_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the number of month: ");
        int monthNum = sc.nextInt();

        System.out.print ("Enter the Year: ");
        int yearNum = sc.nextInt();

        int days = 0;
        String monthName = "";

        if (monthNum==2)
        {
            monthName = "February";
            if (yearNum%4==0)
            {
                days = 29;
            }
            else
            {
                days = 28;
            }
            
            
        }
        else if (monthNum != 2)
        {
            switch (monthNum)
            {
                case 1:
                days = 31;
                monthName = "January";
                break;

                case 3:
                days = 31;
                monthName = "March";
                break;

                case 4:
                days = 30;
                monthName = "April";
                break;

                case 5:
                days = 31;
                monthName = "May";
                break;

                case 6:
                days = 30;
                monthName = "June";
                break;

                case 7:
                days = 31;
                monthName = "July";
                break;

                case 8:
                days = 31;
                monthName = "August";
                break;

                case 9:
                days = 30;
                monthName = "September";
                break;

                case 10:
                days = 31;
                monthName = "October";
                break;

                case 11:
                days = 30;
                monthName = "November";
                break;

                case 12:
                days = 31;
                monthName = "December";
                break;
            }
        }
        else
        {
            System.out.println ("You entered the Wrong input");
        }

        System.out.println (monthName + " has " +days+ " days.");


        sc.close();
    }
}