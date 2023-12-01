class Sample3
{
    static
    {
        System.out.println("Stack Block 1");
    }

    static
    {
        System.out.println("Static Block 2");
    }
}

public class Program_3
{
    public static void main (String[] args)
    {
        System.out.println("Main Block");

        Sample3 s = new Sample3();
    }
}