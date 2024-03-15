import java.io.*;
import java.util.ArrayList;

public class Task_2
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<>();

        books = readFromFile();

        for (var i : books)
        {
            System.out.println(i.toString());
        }
    }

    public static ArrayList<Book> readFromFile()
    {
        ArrayList<Book> existingBooks = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("BookStore.ser")))
        {
            while (true)
            {
                try
                {
                    existingBooks.add((Book) objectInputStream.readObject());
                }
                catch (Exception e) 
                {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return existingBooks;
    }
}
