import java.io.*;
import java.util.*;

public class Program_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            BufferedWriter w = new BufferedWriter (new FileWriter("output.txt"));
            w.write("Danyal");
            w.write("\nHere is another line.");
            w.write ("\nthis is line no. 3");
            w.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        // reading from the file
        try
        {
            BufferedReader r = new BufferedReader (new FileReader("output.txt"));

            String s;
            while ( (s = r.readLine()) != null)
            {
                System.out.println(s);
            }

            r.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}