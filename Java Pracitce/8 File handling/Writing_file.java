import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Writing_file
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            FileWriter myWriter = new FileWriter("CreatingFile.txt");
            System.out.print ("Enter any text: ");
            myWriter.write(sc.next());
            myWriter.close();
            System.out.println ("Text has been written in the File.");
        }
        catch (IOException e)
        {
            System.out.println ("An error Occured!");
        }
        sc.close();
    }
}