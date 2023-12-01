interface Member
{
    void callBack ();
}

class Customer implements Member
{
    private String name;

    public Customer (String name)
    {
        this.name = name;
    }

    public void callBack ()
    {
        System.out.println("Ok, I will visit. " + this.name);
    }
}

class Shop
{
    Member[] m = new Member[100];
    int count = 0;

    public void register (Member mem)
    {
        m[count++] = mem;
    }

    public void inviteSale ()
    {
        for (int i=0; i<count; i++)
        {
            m[i].callBack();
        }
    }
}

public class Program_3
{
    public static void main (String[] args)
    {
        Shop s = new Shop();

        Customer c1 = new Customer("Danyal");
        Customer c2 = new Customer("Ahmad");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}