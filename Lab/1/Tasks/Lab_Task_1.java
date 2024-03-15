import java.util.*;

class Student
{
    String name;
    String regNo;
    String CGPA;
    String dept;
    String section;
    
    public void settingData (String nameOfStudent, String regNoOfStudent, String cgpaOfStudent, String deptOfStudent, String sectionOfStudent)
    {
        name = nameOfStudent;
        regNo = regNoOfStudent;
        CGPA = cgpaOfStudent;
        dept = deptOfStudent;
        section = sectionOfStudent;
    }
    
    public void display ()
    {
        System.out.println ("Name: " + name + ". Registration Number: " +regNo+ ". CGPA: " +CGPA+ ". Department: " +dept+ ". Section: " + section );
    }
}


public class Lab_Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter your name: ");
        String name = sc.nextLine();
        System.out.print ("Enter registration no. ");
        String regNo = sc.nextLine();
        System.out.print ("Enter CGPA: ");
        String CGPA = sc.nextLine();
        System.out.print ("Enter Dept. name: ");
        String dept = sc.nextLine();
        System.out.print ("Enter section: ");
        String sect = sc.nextLine();
        
        Student s1 = new Student ();
        s1.settingData(name, regNo, CGPA, dept, sect);
        s1.display();
        sc.close();
    }
}