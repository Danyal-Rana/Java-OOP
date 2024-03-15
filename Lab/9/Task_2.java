abstract class Person
{
    protected String name;

    public Person () {}

    public Person (String name)
    {
        this.name = name;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return this.name;
    }

    abstract public boolean isOutstanding ();
}

class Student extends Person
{
    private double CGPA;

    public Student () {}

    public Student (String name, double cgpa)
    {
        this.name = name;
        this.CGPA = cgpa;
    }

    public void setCGPA (double cgpa)
    {
        this.CGPA = cgpa;
    }

    public double getCGPA ()
    {
        return this.CGPA;
    }

    public boolean isOutstanding ()
    {
        if (this.CGPA > 3.5)
        {
            return true;
        }
        return false;
    }
}

class Professor extends Person
{
    private int numberOfPublications;
    private static int publicationsCount = 50;

    public Professor () {}

    public Professor (String name, int numOfPub)
    {
        this.name = name;
        this.numberOfPublications = numOfPub;
    }

    public void setNumberOfPublications (int numOfPub)
    {
        this.numberOfPublications = numOfPub;
    }

    public int getNumberOfPublications ()
    {
        return this.numberOfPublications;
    }

    public static void setPublicationsCount (int pubCounts)
    {
        publicationsCount = pubCounts;
    }

    public boolean isOutstanding ()
    {
        if (this.numberOfPublications > publicationsCount)
        {
            return true;
        }
        return false;
    }
}



public class Task_2
{
    public static void main (String[] args)
    {
        Person[] personArr = new Person[5];
        personArr[0] = new Student ("Ahmad", 3.51);
        personArr[1] = new Professor ("Professor1", 160);
        personArr[2] = new Student ("Danyal", 2.7);
        personArr[3] = new Professor ("Professor2", 90);
        personArr[4] = new Student ("Jamshid", 3.9);

        for (int i=0; i<5; i++)
        {
            if (personArr[i] instanceof Student tempStudent)
            {
                System.out.println (tempStudent.isOutstanding ());
            }
            else if (personArr[i] instanceof Professor)
            {
                Professor tempProfessor = (Professor) personArr[i];
                Professor.setPublicationsCount (100);
                System.out.println (tempProfessor.isOutstanding ());
            }
        }
    }
}
