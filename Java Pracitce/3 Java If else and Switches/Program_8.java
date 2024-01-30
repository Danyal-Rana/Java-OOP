import java.util.*;

public class Program_8

{
    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the month: ");
        int q = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (m == 1 || m == 2)
        {
            year -= 1;
            if (m == 1) {
                m = 13;
            } else {
                m = 14;
            }
        }

        int j = year / 100;

        int k = year % 100;

        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

        String day = "a";

        if ((q > 0) && (q < 31) && (2 < m) && (m <= 14))
        {
            if (h == 0)
            {
                day = "Saturday";
            }
            else if (h == 1)
            {
                day = "Sunday";
            }
            else if (h == 2)
            {
                day = "Monday";
            }
            else if (h == 3)
            {
                day = "Tuesday";
            }
            else if (h == 4)
            {
                day = "Wednesday";
            }
            else if (h == 5)
            {
                day = "Thursday";
            }
            else if (h == 6)
            {
                day = "Friday";
            }
            else
            {
                day = "Holiday";
            }

            System.out.println("Day of the week is " + day);
        }
        else
        {
            System.out.println("You entered the wrong input.");
        }

        sc.close();
    }
}