import java.util.Scanner;

class Marks
{
    private int marksOfOOP;
    private int marksOfDSA;
    private int marksOfDLD;

    Marks ()
    {
        this.marksOfOOP = 50;
        this.marksOfDSA = 50;
        this.marksOfDLD = 50;

        System.out.println ("Object has been created, Successfully.");
    }

    Marks (int marksOfOOP, int marksOfDSA, int marksOfDLD)
    {
        if (marksOfOOP>0 && marksOfDSA>0 && marksOfDLD>0 && marksOfOOP<101 && marksOfDSA<101 && marksOfDLD<101)
        {
            this.marksOfOOP = marksOfOOP;
            this.marksOfDSA = marksOfDSA;
            this.marksOfDLD = marksOfDLD;
        }
        else
        {
            this.marksOfOOP = 0;
            this.marksOfDSA = 0;
            this.marksOfDLD = 0;
        }

        System.out.println ("Object has been created, Successfully.");
    }

    int sumOfMarks ()
    {
        return this.marksOfOOP + this.marksOfDSA + this.marksOfDLD;
    }

    public void setMarksOfOOP (int marksOfOOP)
    {
        this.marksOfOOP = marksOfOOP;
    }

    public void setMarksOfDSA (int marksOfDSA)
    {
        this.marksOfDSA = marksOfDSA;
    }

    public void setMarksOfDLD (int marksOfDLD)
    {
        this.marksOfDLD = marksOfDLD;
    }

    public int getMarksOfOOP ()
    {
        return this.marksOfOOP;
    }

    public int getMarksOfDSA ()
    {
        return this.marksOfDSA;
    }

    public int getMarksOfDLD ()
    {
        return this.marksOfDLD;
    }
    
}

public class Task_4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println ();

        System.out.println ("Creating the object using Non-parameterized constructor.");
        Marks m1 = new Marks();
        System.out.println ("Sum of Marks is: " + m1.sumOfMarks());

        System.out.println ();

        System.out.println ("Creating the object using Parameterized constructor.");
        System.out.print ("Enter the marks of OOP: ");
        int marksOfOOP = sc.nextInt();
        System.out.print ("Enter the marks of DSA: ");
        int marksOfDSA = sc.nextInt();
        System.out.print ("Enter the marks of DLD: ");
        int marksOfDLD = sc.nextInt();

        Marks m2 = new Marks(marksOfOOP, marksOfDSA, marksOfDLD);
        System.out.println ("Sum of Marks is: " + m2.sumOfMarks());

        sc.close();
    }
}
