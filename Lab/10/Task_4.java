interface Enumeration
{
    public boolean hasNext (int index);
    public Object getNext (int index);
}

class NameCollection implements Enumeration
{
    String[] names = new String[100];

    public NameCollection () {}

    public NameCollection (String[] names)
    {
        this.names = names;
    }

    public void setNames (String[] names)
    {
        this.names = names;
    }

    public String[] getNames ()
    {
        return names;
    }

    @Override
    public boolean hasNext (int index)
    {
        return index < names.length && names[index] != null;
    }

    @Override
    public Object getNext (int index)
    {
        if (hasNext(index))
        {
            return names[index];
        }
        return null;
    }
}   

public class Task_4
{
    public static void main (String[] args)
    {
        String[] sampleNames = { "Danyal", "Rana", "Ahmad", "Mashhood", "Daud", "Fasih", "Mutee", "Shahzaib", "Taha", "Kashif"};

        NameCollection nameCollection = new NameCollection(sampleNames);

        int i = 0;
        while (nameCollection.hasNext(i))
        {
            System.out.println(nameCollection.getNext(i++));
        }
    }
}
