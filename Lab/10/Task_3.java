interface Compare
{
    boolean compareObjects (Object o);
}

class InventryItem implements Compare
{
    private String name;
    private int uniqueItemID;

    public InventryItem () {}

    public InventryItem (String name, int uniqueItemID)
    {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setUniqueItemID (int uniqueItemID)
    {
        this.uniqueItemID = uniqueItemID;
    }

    public String getName ()
    {
        return this.name;
    }

    public int getUniqueItemID ()
    {
        return this.uniqueItemID;
    }

    @Override
    public boolean compareObjects(Object o)
    {
        if (o instanceof InventryItem)
        {
            InventryItem otherItem = (InventryItem) o;
            return this.getName().equals(otherItem.getName()) && this.getUniqueItemID() == otherItem.getUniqueItemID();
        }
        return false;
    }

}

public class Task_3
{
    public static void main (String[] args)
    {
        InventryItem item1 = new InventryItem("My Product 1", 505);
        InventryItem item2 = new InventryItem("My Product 1", 505);
        InventryItem item3 = new InventryItem("My Product 2", 505);

        System.out.println(item1.compareObjects(item2));
        System.out.println(item1.compareObjects(item3));
    }
}