import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program_1
{
    public static void main (String[] args)
    {
        try
        {
            BufferedWriter w = new BufferedWriter (new FileWriter("output.txt"));
            w.write("Danyal");
            w.write("\nHere is another line.");
            w.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}