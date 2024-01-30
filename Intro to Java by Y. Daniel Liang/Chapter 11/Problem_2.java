import java.util.*;

class Person
{
    private String name;
    private String address;
    private int phoneNum;
    private String emailAdd;

    public Person ()
    {
        this.name = "Danyal";
        this.address = "Ghauri Garden, Lehtrar Road, Islamabad";
        this.phoneNum = 305216;
        this.emailAdd = "aka.mdrana@gmail.com";
    }

    public Person (String name, String address, int phoneNum, String emailAdd)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAdd = emailAdd;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public void setPhoneNum (int phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public void setEmailAdd (String emailAdd)
    {
        this.emailAdd = emailAdd;
    }

    public String getName ()
    {
        return this.name;
    }

    public String getAddress ()
    {
        return this.address;
    }

    public int getPhoneNum ()
    {
        return this.phoneNum;
    }

    public String getEmailAdd ()
    {
        return this.emailAdd;
    }

    public String toString ()
    {
        return "Name: " +this.name+ "\nAddress: " +this.address+ "\nPhone number: " +this.phoneNum+ "\nEmail: " +this.emailAdd;
    }
}

class Student extends Person
{
    private static String status;

    public Student ()
    {
        status = "Fresh man";
    }

    public Student (String statuss)
    {
        status = statuss;
    }

    public Student (String statuss, String name, String address, int phoneNum, String emailAdd)
    {
        super (name, address, phoneNum, emailAdd);
        status = statuss;
    }

    public static void setStatus (String statuss)
    {
        status = statuss;
    }

    public static String getStatus ()
    {
        return status;
    }

    public String toString ()
    {
        return super.toString() + "Status is: " + this.getStatus();
    }
}

class myDate
{
    private int date;
    private String month;
    private int year;

    public myDate ()
    {
        this.date = 6;
        this.month = "November";
        this.year = 2023;
    }

    public myDate (int date, String month, int year)
    {
        if (date<0)
        {
            System.out.println ("Wrong credentials. Setting default date.");
            this.date = 6;
            this.month = "November";
            this.year = 2023;
        }
        else if (month=="January" || month=="March" || month=="May" || month=="July" || month=="August" || month=="October" || month=="December" && date<=31)
        {
            this.date = date;
            this.month = month;
            this.year = year;
        }
        else if (month=="April" || month=="June" || month=="September" || month=="November" && date<=30)
        {
            this.date = date;
            this.month = month;
            this.year = year;
        }
        else if (month=="February")
        {
            if (year%4==0 && year%100!=0 && date<=29 || year%4!=0 && date<=28)
            {
                this.date = date;
                this.month = month;
                this.year = year;
            }
            else
            {
                System.out.println ("Wrong credentials. Setting default date.");
                this.date = 6;
                this.month = "November";
                this.year = 2023;
            }
        }
        else
        {
            System.out.println ("Wrong credentials. Setting default date.");
            this.date = 6;
            this.month = "November";
            this.year = 2023;
        }
    }

    public int getDate ()
    {
        return this.date;
    }

    public String getMonth ()
    {
        return this.month;
    }

    public int getYear ()
    {
        return this.year;
    }

    public String toString ()
    {
        return this.date + ", " +this.month+ " " + this.year;
    }
}

class Employee extends Person
{
    private String office;
    private double salary;
    private myDate dateHired;

    public Employee ()
    {
        this.office = "Room 11, 2nd Floor, Faculty block";
        this.salary = 200000;
        this.dateHired = new myDate();
    }

    public Employee (String office, double salary, myDate dateHired)
    {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee (String name, String address, int phoneNum, String emailAdd, String office, double salary, myDate dateHired)
    {
        super (name, address, phoneNum, emailAdd);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void setOffice (String office)
    {
        this.office = office;
    }

    public void setSalary (double salary)
    {
        this.salary = salary;
    }

    public void setDateHired (myDate dateHired)
    {
        this.dateHired = dateHired;
    }

    public String getOffice ()
    {
        return this.office;
    }

    public double getSalary ()
    {
        return this.salary;
    }

    public myDate getDateHired ()
    {
        return this.dateHired;
    }

    public String toString ()
    {
        return super.toString()+ "\nOffice: " +this.office+ "\nSalary: " +this.salary+ "Hiring Date: " + this.dateHired;
    }
}

class Faculty extends Employee
{
    private String hours;
    private String rank;

    public Faculty ()
    {
        this.hours = "9am to 2 pm";
        this.rank = "Lecturer";
    }

    public Faculty (String hours, String rank)
    {
        this.hours = hours;
        this.rank = rank;
    }

    public void setHours (String hours)
    {
        this.hours = hours;
    }

    public void setRank (String rank)
    {
        this.rank = rank;
    }

    public String getHours ()
    {
        return this.hours;
    }

    public String getRank ()
    {
        return this.rank;
    }

    public String toString ()
    {
        return super.toString() + "\nWorking hours are: " +this.getHours()+ "\nRank is: " + this.rank;
    }
}

class Staff extends Employee
{
    private String title;

    public Staff ()
    {
        this.title = "Professor";
    }

    public Staff (String title)
    {
        this.title = title;
    }

    public Staff (String title, String office, double salary, myDate dateHired)
    {
        super (office, salary, dateHired);
        this.title = title;
    }

    public Staff (String title, String name, String address, int phoneNum, String emailAdd, String office, double salary, myDate dateHired)
    {
        super (name, address, phoneNum, emailAdd, office, salary, dateHired);
        this.title = title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getTitle ()
    {
        return this.title;
    }

    public String toString ()
    {
        return super.toString() + "\nTitle is: " + this.getTitle();
    }
}

public class Problem_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        sc.close();
    }
}