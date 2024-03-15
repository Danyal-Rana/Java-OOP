class Date
{
    private int day;
    private int month;
    private  int year;

    public Date () {}

    public Date (int day, int month, int year)
    {
        this.day = checkDay (day);
        this.month = checkMonth (month);
        this.year = year;
    }

    public void setDay (int day)
    {
        this.day = checkDay(day);
    }

    public void setMonth (int month)
    {
        this.month = checkMonth(month);
    }

    public void setYear (int year)
    {
        this.year = year;
    }

    public int getDay ()
    {
        return this.day;
    }

    public int getMonth ()
    {
        return this.month;
    }

    public int getYear ()
    {
        return this.year;
    }

    private int checkMonth (int testMonth)
    {
        if (testMonth>=1 && testMonth<=12)
        {
            return testMonth;
        }
        else
        {
            System.out.println("Invalid Month, Setting default Month (1)");
        }
        return 1;
    }

    private int checkDay (int testDay)
    {
        int []daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.month==2 && testDay>0 && testDay<=29 && (this.year%400==0 && (this.year%4==0 || this.year%100!=0)))
        {
            return testDay;
        }

        else if (testDay>0 && testDay<=daysOfMonth[this.month])
        {
            return testDay;
        }

        else
        {
            System.out.println("Invalid date, Setting default (1)");
        }
        return 1;
    }

    public void display ()
    {
        System.out.println (this.day + " " +this.month+ " " + this.year);
    }
}

class Employee
{
    private String name;
    private String fname;
    private Date birthDate;
    private Date hireDate;

    public Employee () {};

    public Employee (String name, String fname, Date birthDate, Date hireDate)
    {
        this.name = name;
        this.fname = fname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setfname (String fname)
    {
        this.fname = fname;
    }

    public void setBirthDate (Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public void setHireDate (Date hireDate)
    {
        this.hireDate = hireDate;
    }

    public String getName ()
    {
        return this.name;
    }

    public String getfname ()
    {
        return this.fname;
    }

    public Date getBirthDate ()
    {
        return this.birthDate;
    }

    public Date getHireDate ()
    {
        return this.hireDate;
    }

    public void display ()
    {
        System.out.print ("Name is: " +this.name+ ".\nFather name is: " +this.fname+ ".\nDate of birth is: ");
        birthDate.display();
        System.out.print ("Hiring Date is: ");
        hireDate.display();
    }
}

public class Activity_2
{
    public static void main (String[] args)
    {
        Date b = new Date(1, 12, 1990);
        Date h = new Date (5, 6, 2016);

        Employee e1 = new Employee("abc", "xyz", b, h);
        e1.display();
    }
}