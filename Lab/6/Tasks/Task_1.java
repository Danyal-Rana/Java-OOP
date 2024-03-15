class Address
{
    private String street;
    private int house;
    private String city;
    private int code;

    public Address () {};

    public Address (String street, int house, String city, int code)
    {
        this.street = street;
        this.house = house;
        this.city = city;
        this.code = code;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public void setHouse (int house)
    {
        this.house = house;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public void setCode (int code) 
    {
        this.code = code;
    }

    public String getStreet ()
    {
        return this.street;
    }

    public int getHouse ()
    {
        return this.house;
    }

    public String getCity ()
    {
        return this.city;
    }

    public int getCode ()
    {
        return this.code;
    }
}

class Person
{
    private String name;
    private Address add;

    public Person () {};

    public Person (String name, Address add)
    {
        this.name = name;
        this.add = add;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setAdd (Address add)
    {
        this.add = add;
    }

    public String getName ()
    {
        return this.name;
    }

    public Address getAdd ()
    {
        return this.add;
    }

    public void display ()
    {
        System.out.println ("My name is " +this.name+ ". I live in " +this.add.getCity()+ ", the postal code of my city is " +this.add.getCode()+ ", I live in house no. " +this.add.getHouse()+ " and the street is " +this.add.getStreet()+ ".");
    }
}

public class Task_1
{
    public static void main(String[] args)
    {
        Address add = new Address("6A", 20, "Islamabad", 45500);

        Person p1 = new Person("Danyal", add);

        p1.setAdd(add);

        p1.display();
    }
}