import java.io.*;
import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the book to search:");
        String searchName = scanner.nextLine();

        Book foundBook = searchBookByName(searchName);

        if (foundBook != null) 
        {
            System.out.println("Book found:");
            System.out.println(foundBook);
        } 
        else 
        {
            System.out.println("Book not found.");
        }

        scanner.close();
    }

    public static Book searchBookByName(String searchName) 
    {
        Book foundBook = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("BookStore.ser"))) 
        {
            while (true) 
            {
                try 
                {
                    Book book = (Book) objectInputStream.readObject();
                    if (book.getName().equalsIgnoreCase(searchName)) 
                    {
                        foundBook = book;
                        break;
                    }
                } 
                catch (EOFException e) 
                {
                    break;
                }
            }
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        return foundBook;
    }
}