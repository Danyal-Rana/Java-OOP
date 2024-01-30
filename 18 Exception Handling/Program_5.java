// checked exceptions
import java.io.*;

public class Program_5
{
    static void fun1 ()
    {
        // FileInputStream f = new FileInputStream("My.txt");
        // we should handle the situation in which this file does not exit and we are trying to open it
    }
    static void fun2 ()
    {
        fun1();
    }

    static void fun3 ()
    {
        fun2();
    }

    public static void main (String[] args)
    {
        fun3();
    }
}
