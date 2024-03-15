class Student
{
    private String name;
    private int [] resultArray;

    public Student ()
    {
        this.name = "";
        this.resultArray = new int [5];
    }

    public Student (String name, int [] resultArray)
    {
        this.name = name;
        this.resultArray = resultArray;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setResultArray (int[] resultArray)
    {
        this.resultArray = resultArray;
    }

    public String getName ()
    {
        return this.name;
    }

    public int[] getResultArray ()
    {
        return this.resultArray;
    }

    public double averageResult ()
    {
        int sum = 0;

        for (int i=0; i<5; i++)
        {
            sum += this.resultArray[i];
        }

        return sum/5;
    }

    public void display ()
    {
        System.out.println ("The name of student is: " + this.name + " and he/she got " + this.averageResult() + ".");
    }
}

public class Lab_Task_3
{
    public static void main (String[] args)
    {
        Student s1 = new Student();
        s1.setName("Danyal");
        s1.setResultArray(new int[]{40, 50, 40, 50, 50});
        System.out.println ("The average of Student 1 is: " + s1.averageResult());

        Student s2 = new Student("Mashhood", new int[]{60, 70, 60, 70, 60});
        System.out.println ("The average of Student 2 is: " + s2.averageResult());


        // getting the higher average

        if (s1.averageResult() < s2.averageResult())
        {
            System.out.println ("Student 2, " +s2.getName() + " has higher average.");
        }
        else
        {
            System.out.println ("Student 1, " +s1.getName() + " has higher average.");
        }


        // student 3

        Student s3 = new Student();
        s3.setName(s1.getName());
        s3.setResultArray(s2.getResultArray());
        s3.display();
    }
}