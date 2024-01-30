import java.util.*;

public class Program_100 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year (1 for Monday, 2 for Tuesday, etc.): ");
        int firstDay = sc.nextInt();
        sc.close();

        // Loop through each month of the year
        for (int month = 1; month <= 12; month++) {
            System.out.println(getMonthName(month) + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Calculate the number of days in the month
            int numDays = getNumDaysInMonth(month, year);

            // Print the calendar for the month
            int dayOfWeek = 1;
            for (int day = 1; day <= numDays; day++) {
                // Print leading spaces if necessary
                if (day == 1) {
                    for (int i = 1; i < firstDay; i++) {
                        System.out.print("    ");
                        dayOfWeek++;
                    }
                }
                // Print the day
                System.out.printf("%3d ", day);
                dayOfWeek++;
                // Start a new line if necessary
                if (dayOfWeek > 7) {
                    System.out.println();
                    dayOfWeek = 1;
                }
            }
            System.out.println();
        }
    }

    // Returns the number of days in a month for a given year
    public static int getNumDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // Returns true if a given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Returns the name of a given month
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}