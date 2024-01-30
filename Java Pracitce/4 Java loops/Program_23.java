import java.util.*;

public class Program_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first Day of the Year: ");
        int day = sc.nextInt();

        String dayName = "";

        switch (day) {
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

        String month = "";
        int monthNum = 1;

        for (int i = 1; i <= 12; i++)
        {

            switch (i)
            {
                case 1:
                    month = "January";
                    monthNum = i;
                    break;

                case 2:
                    month = "February";
                    monthNum = i;
                    break;

                case 3:
                    month = "March";
                    monthNum = i;
                    break;

                case 4:
                    month = "April";
                    monthNum = i;
                    break;

                case 5:
                    month = "May";
                    monthNum = i;
                    break;

                case 6:
                    month = "June";
                    monthNum = i;
                    break;

                case 7:
                    month = "July";
                    monthNum = i;
                    break;

                case 8:
                    month = "August";
                    monthNum = i;
                    break;

                case 9:
                    month = "September";
                    monthNum = i;
                    break;

                case 10:
                    month = "October";
                    monthNum = i;
                    break;

                case 11:
                    month = "November";
                    monthNum = i;
                    break;

                case 12:
                    month = "Deceomber";
                    monthNum = i;
            }

            System.out.println ("");
            System.out.println ("");
            System.out.println ("");
            System.out.println ("                             " + month +" "+ year);
            System.out.println ("_________________________________________________________________________________");
            
            for (int k=1; k<=7; k++)
            {
                System.out.print (dayName + "   ");
            }
            System.out.println ("");

            for (int j=1; j<=31; j++)
            {
                if (monthNum == 2)
                {
                    if (year%4 != 0)
                    {
                        System.out.print (j + "  ");
                        if (j==28)
                        {
                            break;
                        }
                    }
                    else if (year%4==0)
                    {
                        System.out.print (j + "  ");
                        if (j==29)
                        {
                            break;
                        }
                    }
                }
                else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11)
                {
                    System.out.print (j + "  ");
                        if (j==30)
                        {
                            break;
                        }
                }
                else
                {
                    System.out.print (j + "  ");
                }
            }
        }

        sc.close();
    }
}