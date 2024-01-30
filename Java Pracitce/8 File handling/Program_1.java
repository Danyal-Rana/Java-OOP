import java.io.File;
import java.io.IOException;

public class Program_1
{
    public static void main(String[] args)
    {
        File myFile = new File("CreatingFile.txt");
        
        try
        {
            if (myFile.createNewFile())
            {
                System.out.println ("File Created" + myFile.getName());
            }
            else
            {
                System.out.println ("File already Exist");
            }
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create the file");
        }
    }
}