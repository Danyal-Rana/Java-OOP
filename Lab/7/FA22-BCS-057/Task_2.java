import java.util.*;

class Publication
{
    private String title;
    private double price;

    public void set(String title, double price)
    {
        this.title = title;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

class Book extends Publication
{
    private int pageCount;

    public void set(String title, double price, int pageCount)
    {
        super.set(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication
{
    private int playingTime;

    public void set(String title, double price, int playingTime)
    {
        super.set(title, price);
        this.playingTime = playingTime;
    }

    public int getPlayingTime()
    {
        return playingTime;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
}

public class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();
        Tape tape = new Tape();

        System.out.print("\nEnter book title: ");
        String bookTitle = sc.nextLine();
        System.out.print("Enter book price: $");
        double bookPrice = sc.nextDouble();
        System.out.print("Enter page count: ");
        int pageCount = sc.nextInt();

        System.out.print("\nEnter tape title: ");
        sc.nextLine();
        String tapeTitle = sc.nextLine();
        System.out.print("Enter tape price: $");
        double tapePrice = sc.nextDouble();
        System.out.print("Enter playing time (in minutes): ");
        int playingTime = sc.nextInt();

        book.set(bookTitle, bookPrice, pageCount);
        tape.set(tapeTitle, tapePrice, playingTime);

        System.out.println("\n***Book Details***");
        book.display();

        System.out.println("\n***Tape Details***");
        tape.display();

        sc.close();
    }
}