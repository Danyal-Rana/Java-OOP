import java.util.*;

class Book
{
    private String author;
    private String [] chapterNames;    

    public Book ()
    {
        this.author = null;
        this.chapterNames = new String [100];
    }

    public Book (String author, String[] chapterNames)
    {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setChapterNames(String[] chapterNames)
    {
        this.chapterNames = chapterNames;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String[] getChapterNames()
    {
        return this.chapterNames;
    }

    public static boolean compareBooks (Book a, Book b)
    {
        if (a.getAuthor().equals(b.getAuthor()))
        {
            return true;
        }
        return false;
    }

    public static Book compareChapterNames (Book a, Book b)
    {
        if (a.getChapterNames().length > b.getChapterNames().length)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}

public class Task_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        Book b1 = new Book();
        System.out.print ("Enter the name of Author 1: ");
        b1.setAuthor(sc.next());

        System.out.print ("How many chapter do you want to enter (max 100): ");
        int b1Chapter = sc.nextInt();
        String[] chapterString1 = new String[b1Chapter];

        for (int i=0; i<b1Chapter; i++)
        {
            System.out.print ("Enter the name of " +i+ " chapter: ");
            chapterString1[i] = sc.next();

        }
        b1.setChapterNames(chapterString1);


        Book b2 = new Book();
        System.out.print ("Enter the name of Author 1: ");
        b1.setAuthor(sc.next());

        System.out.print ("How many chapter do you want to enter (max 100): ");
        int b2Chapter = sc.nextInt();
        String[] chapterString2 = new String[b1Chapter];

        for (int i=0; i<b2Chapter; i++)
        {
            System.out.print ("Enter the name of " +i+ " chapter: ");
            chapterString2[i] = sc.next();

        }
        b2.setChapterNames(chapterString1);

        boolean sameAuthor = Book.compareBooks(b1, b2);
        System.out.println("Do both books have the same author? " + sameAuthor);

        Book bookWithMoreChapters = Book.compareChapterNames(b1, b2);

        System.out.println("Author of the book with more chapters is: " + bookWithMoreChapters.getAuthor());

        sc.close();
    }
}