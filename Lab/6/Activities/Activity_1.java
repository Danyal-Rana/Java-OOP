class StudentRecord
{

    private String degree;

    public StudentRecord () {};

    public StudentRecord (String degree)
    {
        this.degree = degree;
    }

    public void setDegree (String degree)
    {
        this.degree = degree;
    }

    public String getDegree ()
    {
        return this.degree;
    }
}

class EmployeeRecord
{
    private int empID;
    private double salary;

    public EmployeeRecord () {};

    public EmployeeRecord (int empID, double salary)
    {
        this.empID = empID;
        this.salary = salary;
    }

    public void setEmpID (int empID)
    {
        this.empID = empID;
    }

    public void setSalary (double salary)
    {
        this.salary = salary;
    }

    public int getEmpID ()
    {
        return this.empID;
    }

    public double getSalary ()
    {
        return this.salary;
    }
}

class Manager
{
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;

    public Manager () {};

    public Manager (String title, double dues, EmployeeRecord emp, StudentRecord stu)
    {
        this.title = title;
        this.dues = dues;
        this.emp = emp;
        this.stu = stu;
    }

    public void display ()
    {
        System.out.println ("Title is: " + this.title);
        System.out.println ("Dues are: " +this.dues);

        System.out.println ("Employee Record is as follows.");
        System.out.println("Employee ID is: " + this.emp.getEmpID());
        System.out.println ("Empliyee Salary is: " + this.emp.getSalary());

        System.out.println ("Student Record is as follows.");
        System.out.println ("Degree is: " + this.stu.getDegree());
    }
}

public class Activity_1
{
    public static void main (String[] args)
    {
        StudentRecord s = new StudentRecord();
        s.setDegree("MBA");

        EmployeeRecord e = new EmployeeRecord();
        e.setEmpID(1);
        e.setSalary(25000);

        Manager m1 = new Manager("Finance Manager", 5000, e, s);
        m1.display();
    }
}