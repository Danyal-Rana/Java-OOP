abstract class aClass
{
    aClass ()
    {
        System.out.println ("An Abstract Class");
    }

    void method1 ()
    {
        System.out.println ("Method 1");
    }

    // abstract void method2 () ;
}

class cClass extends aClass
{
    cClass ()
    {
        System.out.println ("Child Concrete class");
    }
}

public class Program_2
{
    public static void main (String[] args)
    {
        aClass aRev; // allowed

        // aRev = new aClass(); #not_allowed
        
        cClass oRev = new cClass(); // allowed

        aRev = new cClass(); // allowed
    }
}