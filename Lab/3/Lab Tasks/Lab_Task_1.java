class Marks
{
    private int Subject_1;
    private int Subject_2;
    private int Subject_3;

    public Marks ()
    {
        Subject_1 = 0;
        Subject_2 = 0;
        Subject_3 = 0;
    }

    public Marks (int Subject_1, int Subject_2, int Subject_3)
    {
        this.Subject_1 = Subject_1;
        this.Subject_2 = Subject_2;
        this.Subject_3 = Subject_3;
    }

    public void setSubject_1 (int Subject_1)
    {
        this.Subject_1 = Subject_1;
    }

    public void setSubject_2 (int Subject_2)
    {
        this.Subject_2 = Subject_2;
    }

    public void setSubject_3 (int Subject_3)
    {
        this.Subject_3 = Subject_3;
    }

    public int getSubject_1 ()
    {
        return this.Subject_1;
    }

    public int getSubject_2 ()
    {
        return this.Subject_2;
    }

    public int getSubject_3 ()
    {
        return this.Subject_3;
    }

    public int averageMarks ()
    {
        return (this.Subject_1 + this.Subject_2 + this.Subject_3)/3;
    }
}

public class Lab_Task_1
{
    public static void main (String[] args)
    {
        Marks m1 = new Marks();

        m1.setSubject_1 (40);
        m1.setSubject_2 (50);
        m1.setSubject_3 (60);

        System.out.println ("Marks of Subject 1: " + m1.getSubject_1());
        System.out.println ("Marks of Subject 2: " + m1.getSubject_2());
        System.out.println ("Marks of Sunject 3: " + m1.getSubject_3());

        System.out.println ("Average Marsk: " + m1.averageMarks());
    }
}