class Book
{
    private Person p1;
    private String bookName;
    private String publishser;

    public Book () {}

    public Book (Person p1, String bookName, String publisher)
    {
        this.p1 = p1;
        this.bookName = bookName;
        this.publishser = publisher;
    }

    public void setPerson (Person p1)
    {
        this.p1 = p1;
    }

    public void setBookName (String bookName)
    {
        this.bookName = bookName;
    }

    public void setPublisher (String publisher)
    {
        this.publishser = publisher;
    }

    public Person getPerson ()
    {
        return this.p1;
    }

    public String getBookName ()
    {
        return this.bookName;
    }

    public String getPublisher ()
    {
        return this.publishser;
    }

    public void displayBook ()
    {
        System.out.println ("Book name is: " +this.getBookName()+ ", the publisher of book is: " +this.getPublisher()+ " and the book is owned by: " +this.p1.getName()+ " who lives in street no. " +this.p1.getAdd().getStreet()+ ", house no. " +this.p1.getAdd().getHouse()+ ", city: " +this.p1.getAdd().getCity()+ " & postal code is " +this.p1.getAdd().getCode()+ ".\n");
    }
}

public class Task_2
{
    public static void main(String[] args)
    {
        Address add = new Address("6A", 20, "Islamabad", 45500);

        Book b1 = new Book ();
        Person p2 = new Person("Danyal", add);
        b1.setPerson(p2);
        b1.setBookName("Intro to Java");
        b1.setPublisher("Pearson");

        System.out.println ("\nDisplay before Modifying Address: ");
        b1.displayBook();

        // modifying Address of Person of Book class
        System.out.println ("\n");
        b1.getPerson().getAdd().setStreet("1");
        b1.getPerson().getAdd().setHouse(3);
        b1.getPerson().getAdd().setCity("Rohillan Wali, District Muzafar Garh");
        b1.getPerson().getAdd().setCode(34400);

        System.out.println ("Display after Modifying Address: ");
        b1.displayBook();
    }
}