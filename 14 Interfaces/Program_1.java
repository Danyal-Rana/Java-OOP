interface Test1
{
    void method1 ();
    void method2 ();
}

class Test2 implements Test1
{
    public void method1 ()
    {
        System.out.println("Method 1 of Test2");
    }

    public void method2 ()
    {
        System.out.println("Method 2 of Test2");
    }

    public void method3 ()
    {
        System.out.println("Method 3 of Test2");
    }
}

public class Program_1
{
    public static void main (String[] args)
    {
        Test1 t = new Test2 ();

        t.method1();
        t.method2();
        // t.method3(); #can't be use as reference is of Interface Test1

        Test2 temp = new Test2();
        temp.method3();
    }
}