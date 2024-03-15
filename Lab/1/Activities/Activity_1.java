class CourseResult
{
    public String studentName;
    public String courseName;
    public String grade;
    
    public void display()
    {
        System.out.println ("Student Name is: " + studentName + ". Course Name is: " + courseName + ". Grade is: " + grade);
    }
}

public class Activity_1
{
    public static void main(String[] args)
    {
        CourseResult c1 = new CourseResult();
        c1.studentName = "Danyal";
        c1.courseName = "OOP";
        c1.grade = "A";
        c1.display();
        
        CourseResult c2 = new CourseResult();
        c2.studentName = "Huzaifa";
        c2.courseName = "DSA";
        c2.grade = "A+";
        c2.display();
    }    
}
