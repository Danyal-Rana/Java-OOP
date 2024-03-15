class Person
{
    protected String name;
    protected String address;
    protected int phoneNum;
    protected String emailAdd;

    public Person () {}

    public Person (String name, String address, int phoneNum, String emailAdd)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAdd = emailAdd;
    }

    public String toString ()
    {
        return "Name: " +this.name+ "\nAddress: " +this.address+ "\nPhone Number: " +this.phoneNum+ "\nEmail: " + this.emailAdd;
    }
}

class Student extends Person
{
    private String status;

    public Student () {}

    public Student (String status)
    {
        this.status = status;
    }

    public Student (String name, String address, int phoneNum, String emailAdd, String status)
    {
        super(name, address, phoneNum, emailAdd);
        this.status = status;
    }

    public String toString ()
    {
        return super.toString().concat ("\nStatus: " + this.status);
    }
}

class Employee extends Person
{
    protected String office;
    protected double salary;
    protected Date dateHired;

    public Employee () {}

    public Employee (String office, double salary, Date dateHired)
    {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee (String name, String address, int phoneNum, String emailAdd, String office, double salary, Date dateHired)
    {
        super(name, address, phoneNum, emailAdd);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;        
    }

    public String toString ()
    {
        return super.toString().concat("\nOffice: " +this.office+ "\nSalary: " +this.salary+ "\nHiring Date: " + this.dateHired.toString());
    }
}

class Faculty extends Employee
{
    private String officeHours;
    private String rank;

    public Faculty () {}

    public Faculty (String officeHours, String rank)
    {
        this.officeHours = rank;
        this.rank = rank;
    }

    public Faculty (String name, String address, int phoneNum, String emailAdd, String office, double salary, Date dateHired ,String officeHours, String rank)
    {
        super (name, address, phoneNum, emailAdd, office, salary, dateHired);
        this.officeHours = rank;
        this.rank = rank;
    }

    public String toString ()
    {
        return super.toString().concat("\nOffice Hours: " +this.officeHours+ "\nRank: " +this.rank);
    }
}

class Staff extends Employee
{
    private String title;

    public Staff () {}

    public Staff (String title)
    {
        this.title = title;
    }

    public Staff (String name, String address, int phoneNum, String emailAdd, String office, double salary, Date dateHired, String title)
    {
        super (name, address, phoneNum, emailAdd, office, salary, dateHired);
        this.title = title;
    }

    public String toString ()
    {
        return super.toString().concat("\nTitle: " + this.title);
    }
}

class Date
{
    private int day;
    private String month;
    private int year;

    public Date () {}

    public Date (int day, String month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString ()
    {
        return "Day: " +this.day+ "\nMonth: " +this.month+ "\nYear: " + this.year;
    }
}

public class Task_1
{
    public static void main (String[] args)
    {
        Date dateEmployee = new Date (2, "April", 1990);
        Date dateFaculty = new Date(21, "November", 2000);
        Date dateStaff = new Date(1, "January", 2010);

        Person p1 = new Person("Danyal", "Bloack AB-II", 3052162, "FA22-BCS-057@ISBSTUDENT.COMSATS.EDU.PK");
        Student student1 = new Student("Pass");
        Employee e1 = new Employee("Ahmad", "Block AB-I", 313619, "ahmad@yahoo.com", "A-105", 200000, dateEmployee);
        Faculty f1 = new Faculty("Akram", "Faculty Block", 3456789, "akram@outlook.com", "G-100", 300000, dateFaculty, "9:00 AM to 2:00 PM (Monday to Friday)", "Associate Professor");
        Staff staff1 = new Staff("Shahzad", "Staff Block, Comsats, Isb", 3215678, "shahzad@gmail.com", "B-207", 150000, dateStaff, "Security Incharge");

        System.out.println ("\n ***Object of Person class.***\n" + p1.toString());

        System.out.println ("\n\n ***Object of Student class.***\n" + student1.toString());

        System.out.println ("\n\n ***Object of Employee class.***\n" + e1.toString());

        System.out.println ("\n\n ***Object of Faculty class.*** \n" + f1.toString());

        System.out.println ("\n\n ***Object of Staff class.*** \n" + staff1.toString());
    }
}

